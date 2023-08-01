class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        if(dist.length-1 >= hour) return -1;
        int start = 1, end = 10000000;
        
        while(start < end){
            int middle = (end - start) / 2 + start;
            if(checkValid(dist, middle, hour)) end = middle;
            else start = middle+1;
        }

        return start;
    }

    private boolean checkValid(int[] dist, int middleVal, double hour) {
        double totalNeededTime = 0;

        for(int i=0; i<dist.length; i++){
            if(i == dist.length-1) totalNeededTime += (double)dist[i]/(double)middleVal;
            else totalNeededTime += dist[i]%middleVal == 0 ? 
                 dist[i] / middleVal : (dist[i]/middleVal) + 1;
        }

        return (totalNeededTime <= hour);
    }
}