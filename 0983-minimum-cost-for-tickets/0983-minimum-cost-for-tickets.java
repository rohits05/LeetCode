class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int []dp = new int[400];
        
        for(int i=399; i>=1; i--){
            if(i > days[days.length-1]){
                dp[i] = 0;
                continue;
            }
            
            if(willTravel(days, i)){
                int val1 = costs[0]+dp[i+1], val2 = costs[1]+dp[i+7], val3 = costs[2]+dp[i+30];
                dp[i] = Math.min(val1, Math.min(val2, val3));
            }else dp[i] = dp[i+1];
        }
        
        return dp[1];
    }
    
    public boolean willTravel(int []days, int day){
        for(int i=0; i<days.length; i++){
            if(days[i] == day) return true;
        }
        
        return false;
    }
}