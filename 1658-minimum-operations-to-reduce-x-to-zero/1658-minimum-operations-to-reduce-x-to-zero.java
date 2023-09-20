class Solution {
    public int minOperations(int[] nums, int x) {
        int n =nums.length, l =0, cnt =0, sum =-x, currSum =0;

        for(int items: nums) sum += items;
        if(sum == 0) return n;

        for(int i=0; i<n; i++){
            currSum += nums[i];
            while(l <= i && currSum > sum){
                currSum -= nums[l];
                l++;
            }
            if(currSum == sum) cnt = Math.max(cnt, i-l+1);
        }
        
        return (cnt != 0 ? n-cnt: -1);
    }
}