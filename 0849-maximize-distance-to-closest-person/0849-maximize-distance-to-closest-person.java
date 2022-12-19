class Solution {
    public int maxDistToClosest(int[] nums) {
        int n = nums.length, max = 0, i = 0;
        
        while(i < n){
            while(i < n && nums[i] == 1) i++;
            int j = i;
            while(i < n && nums[i] == 0) i++;
            
            if(j == 0 || i == n) max = Math.max(max, i - j);
            else max = Math.max(max, (i - j + 1) / 2) ;
        }
        return max;
    }
}