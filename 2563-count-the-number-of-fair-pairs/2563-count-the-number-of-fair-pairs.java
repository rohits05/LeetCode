class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        int n = nums.length;
        long result = 0;
        for(int i=0; i<n-1; i++){
            long lowSum = lower - nums[i], highSum = upper - nums[i];
            int count1 = lowerBound(i+1, n, nums, lowSum),
            count2 = upperBound(i+1, n, nums, highSum);
            result += (count2 - count1);
        }
        return result;
    }
    
    private int lowerBound(int start, int end, int[] nums, long key){
        while(start < end){
            int mid = start + (end - start)/2;
            if(nums[mid] < key) start = mid + 1;
            else end = mid;
        }
        return start;
    }
    
    private int upperBound(int start, int end, int[] nums, long key){
        while(start < end){
            int mid = start + (end - start)/2;
            if(nums[mid] <= key) start = mid + 1;
            else end = mid;
        }
        return start;
    }
}