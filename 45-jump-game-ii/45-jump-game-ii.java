class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        
        int start =0, end =0, toFar =0;
        int reach =0;
        for(int i=0; i<n-1; i++){
            toFar = Math.max(toFar, i + nums[i]);
             if(i==end) {
                 reach ++;
                 end = toFar;
             }
        }
        return reach;
    }
}