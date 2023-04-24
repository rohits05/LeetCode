class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return countPartitions(nums.length, target, nums);
    }
    
    public int perfectSum(int arr[],int n, int sum){ 
	    // int dp[][] = new int[n][sum+1];
	    int prev[] = new int[sum+1];
	    
	    if(arr[0] == 0) prev[0]=2;
	    else{
    	    prev[0] = 1;
    	    if(sum >= arr[0]) prev[arr[0]] = 1;
	    }
	      for(int i=1; i<n; i++){
	          int cur[] = new int[sum+1];
	          for(int t=0; t<=sum; t++){
                  int notTaken = prev[t];
                  int taken = 0;
                  
                  if(arr[i] <= t) taken = prev[t-arr[i]];
                  cur[t] = (notTaken + taken);
	          }
	          prev = cur;
	      }
	      
	      return prev[sum];
    } 
    
    
    int countPartitions(int n, int d,int[] arr){
        int totSum = 0;
        for(int i=0; i<n; i++) totSum += arr[i];
    
        //Checking for edge cases
        if(totSum-d < 0 || (totSum-d)%2 == 1) return 0;
        
        return perfectSum(arr, n, (totSum-d)/2);
   }
}