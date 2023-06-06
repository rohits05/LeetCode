class Solution {
    public void rotate(int[][] matrix) {
        int n =matrix.length, m =matrix[0].length;
        for(int i=0; i<n; i++){
            for(int j=i; j<m; j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        for(int i=0 ; i<n; i++){
            for(int j=0; j<n/2; j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }
    }
}