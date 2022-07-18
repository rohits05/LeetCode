class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }
        
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                HashMap<Integer, Integer> map = new HashMap<>();
                map.put(0, 1);
                int right = 0;
                for (int k = 0; k < m; k++) {
                    right += matrix[k][j] - (i == 0 ? 0 : matrix[k][i - 1]);
                    int left = right - target;
                    ans += map.getOrDefault(left, 0);
                    map.put(right, map.getOrDefault(right, 0) + 1);
                }
            }
        }
        return ans;
    }
}