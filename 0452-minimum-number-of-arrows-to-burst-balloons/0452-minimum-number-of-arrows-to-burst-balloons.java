class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(o -> o[1])); 
        int tmp = points[0][1]; int res = 1;

        for(int i=1; i<points.length; i++){
            if(points[i][0] > tmp){
                tmp = points[i][1]; res++;
            }
        }
        return res;
    }
}