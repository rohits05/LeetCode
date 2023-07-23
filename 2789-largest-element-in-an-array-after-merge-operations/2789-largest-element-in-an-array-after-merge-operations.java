class Solution {
    public long maxArrayValue(int[] nums) {
        int n =nums.length;
//         Stack<Long> st = new Stack<>();
//         st.add((long)nums[n-1]);
        
        long res =nums[n-1];
//         for(int i=n-2; i>=0; i--){
//             long curr =nums[i], val=0;
//             if(!st.isEmpty()){
//                 val =st.pop();
//                 val = val >= curr? val: 0;
//             }
            
//             st.add((long)(curr + val));
//             res = Math.max(res, Math.max(curr, st.isEmpty() ? 0: st.peek()));
//         }
        
//         return res;
        
        for(int i=n-2; i>=0; i--){
            if(nums[i] > res) res = nums[i];
            else res += nums[i];
        }
        return res;
    }
}