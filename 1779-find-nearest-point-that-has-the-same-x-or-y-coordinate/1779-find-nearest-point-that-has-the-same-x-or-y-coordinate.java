class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int result = -1, minDistance = 10000;
        
        for(int i=0; i<points.length; i++){
            int mDist = Math.abs(points[i][0] - x) + Math.abs(points[i][1] - y);
            if(((points[i][0] == x) || (points[i][1] == y)) && mDist < minDistance )
            { minDistance = mDist; result = i; }
        }
        
        return result;
    }
}