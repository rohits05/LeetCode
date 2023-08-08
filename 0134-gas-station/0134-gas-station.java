class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        for(int startPoint=0; startPoint<gas.length; startPoint++){
            if(gas[startPoint] >= cost[startPoint]){
                
            int endPoint = findEndPoint(startPoint, gas, cost);
                if(endPoint == startPoint) return startPoint;
                if(startPoint > endPoint) return -1;
                startPoint = endPoint;
            }
        }
        
        return -1;
    }

    private int findEndPoint(int start, int[] gas, int[] cost) {
        int end = (start == gas.length - 1) ? 0 : start + 1;
        int remainingGas = gas[start] - cost[start];
        
        while(end != start){
            remainingGas += gas[end] - cost[end];
            if(remainingGas < 0) return end;
            end++;
            if(end == gas.length) end = 0;
        }
        
        return start;
    }
}