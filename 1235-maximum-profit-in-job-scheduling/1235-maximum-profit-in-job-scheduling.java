class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = startTime.length;
        int[][] jobs = new int[n][3];
        for(int i=0; i<n; i++)
            jobs[i] = new int[]{startTime[i], endTime[i], profit[i]};

        Arrays.sort(jobs, (a, b) -> a[1] - b[1]);
        int[] dp = new int[n];
        dp[0] = jobs[0][2];
        for(int i=1; i<n; i++){
            dp[i] = Math.max(jobs[i][2], dp[i - 1]);
            int preEndTime = largestSmaller(jobs, i, jobs[i][0]);
            if(preEndTime != -1) dp[i] = Math.max(dp[i], dp[preEndTime] + jobs[i][2]);
        }

        int max = Integer.MIN_VALUE;
        for(int val: dp) max = Math.max(max, val);
        return max;
    }

    private int largestSmaller(int[][] jobs, int right, int target) {
        int left = 0;
        while(left + 1 < right){
            int mid = left+(right - left)/2;
            if (jobs[mid][1] <= target) left = mid;
            else right = mid; 
        }

        if(jobs[right][1] <= target) return right;
        if(jobs[left][1] <= target) return left;

        return -1;
    }
}