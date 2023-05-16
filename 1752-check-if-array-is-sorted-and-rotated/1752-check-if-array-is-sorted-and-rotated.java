class Solution {
    public boolean check(int[] nums) {
        int cnt =0, n =nums.length;
        
        for(int i=1; i<=n; i++) if(nums[i-1] > nums[i%n]) cnt++;
        if(cnt > 1) return false;
        return true;
    }
}