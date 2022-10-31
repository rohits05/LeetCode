class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int height = matrix.length, width = matrix[0].length;
        if (height <= 1 || width <= 1) return true;
        for(int i=1; i<height; i++){
            for(int j=1; j<width; j++){
                if(matrix[i][j] != matrix[i-1][j-1])  return false;
            }
        }
        return true;
    }
}