class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int m = maze.length, n = maze[0].length, entranceI = entrance[0], entranceJ = entrance[1];
        
        int[][] dirArray = new int[][] {{0,1}, {1,0}, {-1,0}, {0,-1}};
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{entranceI, entranceJ, 0});
        
        HashSet<Pair<Integer, Integer>> visited = new HashSet<>();
        visited.add(new Pair<>(entranceI, entranceJ));
        
        while(!queue.isEmpty()) {
            int[] cell = queue.poll();
            int x = cell[0], y = cell[1], distance = cell[2];

            for(int[] dir : dirArray) {
                int newX = x + dir[0], newY = y + dir[1];
                
                if(newX<0 || newY<0 || newX>m-1 || newY>n-1 || maze[newX][newY] != '.') continue;
                if(visited.contains(new Pair<>(newX, newY))) continue;

                if(newX == 0 || newY == 0 || newX == m-1 || newY == n-1)  return distance + 1;

                visited.add(new Pair<>(newX, newY));
                queue.add(new int[]{newX, newY, distance+1});
            }
        }
        return -1;
    }
}