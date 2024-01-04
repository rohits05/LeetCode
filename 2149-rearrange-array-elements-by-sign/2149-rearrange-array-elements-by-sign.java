class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pIdx =0, nIdx =1;
        int res[] = new int[nums.length];
        
        for(int el: nums){
            if(el >= 0) { 
                res[pIdx] = el;
                pIdx += 2;
            } else { 
                res[nIdx] = el; 
                nIdx += 2;
            }
        }
        
        return res;
    }
}