class Solution {
    public int diagonalSum(int[][] mat) {
        int sum =0, n =mat.length;
        for(int i=0; i<n; i++){
               sum += mat[i][i] + mat[i][n-i-1]; // r = c & r + c
        }
        
        if(n % 2 != 0) sum -= mat[n/2][n/2];
        return sum;
    }
}