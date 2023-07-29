class Solution {
    public int longestSubarray(int[] nums) {
        int ans = Integer.MIN_VALUE, current = 0;
        int count = 0, n = nums.length;
        List<Integer> l = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            if(nums[i] == 0){
                l.add(count);
                count = 0;
            }
            else count++;
        }
        
        if(nums[n-1] == 1) l.add(count);
        for(int i=0; i<l.size()-1; i++){
            current = l.get(i) + l.get(i+1);
            if(current>ans) ans = current;
        }
        
        if(ans == Integer.MIN_VALUE) return nums.length-1;
        return ans;
    }
}