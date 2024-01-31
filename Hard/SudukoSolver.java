
// class Solution {
//     public void solveSudoku(char[][] board) {
//         sudokuSolver(board,0,0); // row =0,col=0
//     }

//     static boolean sudokuSolver(char board[][],int row,int col){
//         // base case
//           if(row == 9 && col == 9){
//               return true;
//           }
//           else if(row == 9){
//               return false;
//           }
//         // recursion
//         int nextRow=row;
//         int nextCol=col+1;
//         if(nextCol == 9){
//             nextRow=row+1;
//             nextCol=0;
//         }

//         if( board[row][col] !=0){
//             sudokuSolver(board,nextRow,nextCol);
//         }
//         for(char digit='1';digit<='9';digit++){
//             if(isSafe(board,row,col,digit)){
//                 board[row][col]=digit;
//                 if(sudokuSolver(board,nextRow,nextCol)){ // soluntion exist
//                     return true;
//                 }
//                 board[row][col]='.';
//             }
            
//         }
//          return false;
//     }

//     static boolean isSafe(char board[][],int row ,int col,int digit){
//         // for row
//         for(int i=row;i<=8;i++){
//             if(board[i][col] == digit){
//                 return false;
//             }
//         }

//         // for col
//         for(int i=col;i<=8;i++){
//             if(board[row][i] ==digit){
//                 return false;
//             }
//         }

//         // for grid

//         int Sr=(row/3)*3;
//         int Sc=(col/3)*3;

//         for(int i=Sr; i<=3;i++){
//             for(int j=Sc;j<=3;j++){
//                 if(board[i][j] == digit){
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }
// }
class Solution {
    public void solveSudoku(char[][] board) {
        // Start solving sudoku from the first cell
        solve(board, 0, 0);
    }

    private boolean solve(char[][] board, int row, int col) {
        // Base case: If row is equal to board length, entire board has been filled
        if (row == board.length) {
            return true;
        }
        
        // Move to next row when current row is fully filled
        if (col == board[0].length) {
            return solve(board, row + 1, 0);
        }
        
        // Skip cells that are already filled
        if (board[row][col] != '.') {
            return solve(board, row, col + 1);
        }
        
        // Try different numbers in current cell
        for (char num = '1'; num <= '9'; num++) {
            if (isValidPlacement(board, row, col, num)) {
                board[row][col] = num; // Fill current cell with valid number
                
                // Move to next cell
                if (solve(board, row, col + 1)) {
                    return true;
                }
                
                // Backtrack to previous state if solution not found
                board[row][col] = '.';
            }
        }
        
        // No valid solution found
        return false;
    }

    private boolean isValidPlacement(char[][] board, int row, int col, char num) {
        // Check if num is already in the same row, column or 3x3 subgrid
        for (int i = 0; i < board.length; i++) {
            // Check row
            if (board[i][col] == num) {
                return false;
            }

            // Check column
            if (board[row][i] == num) {
                return false;
            }
 
            // Check 3x3 subgrid
            int subgridRow = 3 * (row / 3) + i / 3; // Calculate row index of subgrid
            int subgridCol = 3 * (col / 3) + i % 3; // Calculate column index of subgrid
 
            if (board[subgridRow][subgridCol] == num) {
                return false;
            }
        }

        // Placement is valid
        return true;
    }
}