class Solution {
    public int totalHammingDistance(int[] nums) {
        int maxC =0, n =nums.length;
        
        for(int i=0; i<32; i++){
            int bixC =0;
            for(int j=0; j<n; j++){
                if((nums[j] & (1<<i)) != 0) bixC++;
            }
            maxC += (bixC*(n-bixC));
        }
        
        return maxC;
    }
}