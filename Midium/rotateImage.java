class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        
        for(int i=0;i<(n+1)/2;i++){
            for(int j=0;j<n/2;j++){
                //here is do first swap
                // temp=downleft (downleft value store in temp vairable)
                int temp=matrix[n-1-j][i];
                //downleft=downright
                matrix[n-1-j][i]=matrix[n-1-i][n-j-1];
                //downRight=topRight
                matrix[n-1-i][n-j-1]=matrix[j][n-1-i];
                //topRight=topLeft
                matrix[j][n-1-i]=matrix[i][j];
                //topLeft=temp
                matrix[i][j]=temp;
            }
        }
    }
    
}