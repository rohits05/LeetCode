class Solution {
    public int maximumProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int min3 = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++) {
            Integer val = nums[i];
            // Finding the 3 Maximum No.s
            if(val >= max1) {
                max3 = max2;
                max2 = max1;
                max1 = val;
            } else if(val >= max2 && val < max1) {
                max3 = max2;
                max2 = val;
            } else if(val >= max3 && val < max2) {
                max3 = val;
            }

            // Finding the 3 Minimum No.s
            if(val <= min1) {
                min3 = min2;
                min2 = min1;
                min1 = val;
            } else if(val <= min2 && val > min1) {
                min3 = min2;
                min2 = val;
            } else if(val <= min3 && val > min2) {
                min3 = val;
            }
        }

        return Math.max(max1*max2*max3, max1*min1*min2);
    }
}