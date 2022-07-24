class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length, i=0, j=n-1;
        while (i<m && j>=0) {
            
            if (matrix[i][j]==target) return true;
            else if (matrix[i][j]<target) i++;
            else j--;
         }
         return false;
    }
}