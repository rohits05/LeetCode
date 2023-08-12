class Solution {
    public int minimizeMax(int[] nums, int p) {
        int n = nums.length;
        Arrays.sort(nums); 
        int start = 0, end = nums[n-1] - nums[0];
        
        while(start < end){
            int mid = (start + end)/2, cnt = 0;
            for(int i=1; i<n && cnt<p; i++){    
                if(nums[i] - nums[i-1] <= mid){ 
                    cnt++;
                    i++;
                }
            }
            if(cnt >= p) end = mid;
            else start = mid + 1;
        }
        
        return start;
    }
}