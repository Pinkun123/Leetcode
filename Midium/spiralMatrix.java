import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result=new ArrayList<>();
        int n=matrix.length;
        int startRow=0;
        int endRow=n-1;
        int startCol=0;
        int endCol=matrix[0].length-1;

        while(startRow <= endRow && startCol <= endCol){

            // top
            for(int j=startCol; j<=endCol;j++){
                result.add(matrix[startRow][j]);
            }

            // right
            for(int i=startRow+1 ;i<=endRow;i++){
                result.add(matrix[i][endCol]);
            }

            // buttom
            for(int j=endCol-1; j>=startCol;j--){
                if(startRow == endRow){
                     break;
                 }
                result.add(matrix[endRow][j]);
            }

            // left
             for(int i=endRow-1;i>=startRow+1;i--){
                 if(startCol == endCol){
                    break;
                }
                 result.add(matrix[i][startCol]);
             }
             startRow++;
             endRow--;
             startCol++;
             endCol--;
        }
        return result;
    }
}