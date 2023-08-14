class Solution {
    public int[] getAverages(int[] nums, int k) {
       int n = nums.length;
       int[] avg = new int[n];
       long[] pre = new long[n+1];
       long sum = 0L;

       if(k == 0) return nums;
       for(int i=0; i<n; i++) avg[i] = -1;
       
       if(2*k+1 > n) return avg;
       for(int i=0; i<n; i++){
           sum += nums[i];
           pre[i+1] = sum;
       }
        
       for(int i=k; i<n-k; i++){
           long res = pre[i+k+1] - pre[i-k];
           avg[i] = (int)(res / (k*2+1));
       }

       return avg;
    }
}