class Solution {
    public int minimumAverageDifference(int[] nums) {
        long sum1 = 0l;
        int len = nums.length;
        
        for(int i=0; i<len; i++) sum1+=nums[i];
        
        long sum2 = 0l, min = Integer.MAX_VALUE;
        int minIdx = 0;

        for(int i=0;i <len; i++){
            sum2+=nums[i];
            long ksum = Math.abs(sum1-sum2);
            int d1 = i+1, d2 = len-i-1;
            long m = 0l;

            try{ m = Math.abs((sum2/d1) - (ksum/d2)); }
            catch(Exception e){ m = Math.abs(sum2/d1); }
                        
            if(m<min){
                min = m;
                minIdx = i;
            }
        }
        return minIdx;
    }
}