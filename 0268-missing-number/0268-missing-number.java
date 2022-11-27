class Solution {
    public int missingNumber(int[] nums) {
        int sum =0;
        for(int i=0; i<=nums.length; i++) sum ^= i; // 0 , 1 , 2
        for(int i=0; i<nums.length; i++) sum ^= nums[i]; // Xor 0 , 1 , 2 with ArrEls
        return sum;
    }
}