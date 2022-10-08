class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length < 3)  throw new IllegalArgumentException();
        
        Arrays.sort(nums);
        int n = nums.length, minDiff = Integer.MAX_VALUE, sumClosest = -1;
        
        for(int pre=0; pre<n; pre++) {
            int lo = pre + 1, hi = n - 1;
            while(lo < hi) {
                int curTarget = target - nums[pre];
                int curSum = nums[lo] + nums[hi];
                if(curSum < curTarget) { 
                    if(curTarget - curSum < minDiff) {
                        minDiff = curTarget - curSum;
                        sumClosest = curSum + nums[pre];
                    }
                    lo++;
                    continue;
                }
                if(curSum > curTarget) {
                    if(curSum - curTarget < minDiff) {
                        minDiff = curSum - curTarget;
                        sumClosest = curSum + nums[pre];
                    }
                    hi--;
                    continue;
                }
                return curSum + nums[pre];
            }
        }
        
        return sumClosest;
    }
}