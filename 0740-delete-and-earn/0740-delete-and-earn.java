class Solution {
    public int deleteAndEarn(int[] nums) {
        int prev2 = 0, prev = 0;
        int temp[] = new int[10001];
        
        for(int i: nums) temp[i]++;
        
        for(int i=0; i<=10000; i++){
            int t = prev + temp[i]*i;
            int nT = Math.max(prev2, prev);
            
            prev2 = t; prev = nT;
        }
        return Math.max(prev2, prev);
    }
}