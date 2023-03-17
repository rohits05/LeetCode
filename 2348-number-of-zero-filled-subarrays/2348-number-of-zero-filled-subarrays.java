class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long res =0, preC =0;
        
        for(int n: nums){
            if(n != 0) preC = 0 ;
            else res += preC++ + 1 ;
        }
        
        return res;
    }
}