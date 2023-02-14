class Solution {
    private int m;
    private int n;
    private boolean[][] visited;
    
    public int[][] colorBorder(int[][] grid, int row, int col, int color) {
        m = grid.length; n = grid[0].length;
        visited = new boolean[m][n];
        process(grid, row, col, grid[row][col], color);
        return grid;
    }

    private int process(int[][] grid, int row, int col, int origColor, int color) {
        if(row < 0 || row >= m || col < 0 || col >= n) return 0;
        if(visited[row][col]) return 1;

        if(grid[row][col] != origColor) return 0;

        visited[row][col] = true;
        int score = process(grid, row - 1, col, origColor, color) + process(grid, row, col + 1, origColor, color) + process(grid, row + 1, col, origColor, color) + process(grid, row, col - 1, origColor, color);

        if(score < 4) grid[row][col] = color;

        return 1;
    }
}