class Solution {
    public long getDescentPeriods(int[] prices) {
        int start =0, end =1;
        long count =1;
        
        while(end < prices.length){
            if(prices[end-1] - prices[end] == 1){
                count += (end-start) + 1;
                end++;
            }
            else if(prices[end-1] - prices[end] != 1){
                start = end;
                count += (end-start) + 1;
                end++;
            }
        }
        
        return count;
    }
}