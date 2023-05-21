class Solution {
    public enum State {
        ISLAND1, ISLAND2, WATER
    }
    public class Point {
        int x, y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    
    private Point[] points = {
        new Point(0, 1),
        new Point(1, 0),
        new Point(0, -1),
        new Point(-1, 0)
    };
    
    private void modifyGrid(int[][] grid, State[][] gridCopy, int row, int column, State currentState, boolean[][] visited) {
        if(row < 0 || column < 0 || row >= grid.length || column >= grid[0].length || visited[row][column] || grid[row][column] == 0) return;
        
        visited[row][column] = true;
        gridCopy[row][column] = currentState;
        for(Point point: points)
            modifyGrid(grid, gridCopy, row + point.x, column + point.y, currentState, visited);
    }
    
    public int shortestBridge(int[][] grid) {
        int rows =grid.length, columns =grid[0].length, ans =0;
        State currentState = State.ISLAND1;
        State[][] gridCopy = new State[rows][columns];
        for(int row=0; row<rows; row++) Arrays.fill(gridCopy[row], State.WATER);
        boolean[][] visited = new boolean[rows][columns];
        
        for(int row=0; row<rows; row++){
            for(int column=0; column<columns; column++){
                if(grid[row][column] == 1 && !visited[row][column]){
                    modifyGrid(grid, gridCopy, row, column, currentState, visited);
                    currentState = State.ISLAND2;
                }
            }
        }
        
        visited = new boolean[rows][columns];
        Queue<Point> queue = new LinkedList<>();
        for(int row=0; row<rows; row++){
            for(int column=0; column<columns; column++){
                if(gridCopy[row][column] == State.ISLAND1){
                    queue.offer(new Point(row, column));
                    visited[row][column] = true;
                }
            }
        }
        
        while(!queue.isEmpty()){
            int size = queue.size();
            while(size > 0){
                Point currentPoint = queue.poll();
                for(Point point: points){
                    int row = currentPoint.x + point.x,
                    column = currentPoint.y + point.y;
                    if(!(row < 0 || column < 0 || row >= grid.length 
                       || column >= grid[0].length || visited[row][column])) {
                        if(gridCopy[row][column] == State.ISLAND2) return ans; 
                        queue.offer(new Point(row, column));
                        visited[row][column] = true;
                    }
                }
                size -= 1;
            }
            ans += 1;
        }
        
        return -1;
    }
}