class Solution {
    public int[] findErrorNums(int[] nums) {
        int sum = 0, sqsum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i] - (i+1);
            sqsum += nums[i] * nums[i] - (i+1) * (i+1);
        }
        
        int n = nums.length, diff = sum;
        sum = sqsum / sum;
        int a[] = new int[2];
        a[0] = (sum + diff)/2;
        a[1] = (sum - a[0]);
        return a;
    }
}