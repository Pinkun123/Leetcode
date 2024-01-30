class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int n=mat.length;
        for(int i=0;i<n;i++){
            sum+=mat[i][i]; // pointer at same idx
            if(i != n-1-i){ // i != j // j=n-1-i
            sum+=mat[i][n-1-i];

            }
        }
        return sum;
    }
}