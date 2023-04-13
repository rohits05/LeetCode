class Solution {
    public boolean canPartition(int[] arr) {
        int N = arr.length, total = 0;
        for(int i=0; i<N; i++) total += arr[i];
        if(total % 2 == 1) return false;
        
        int target = total/2;
        return subsetSumTarget(arr, N, target);
    }
    
    // JusT Subset Sum Logic ~ Space OpTimizeD !!
    static boolean subsetSumTarget(int arr[], int N, int sum) {
       boolean[] prev = new boolean[N+1];
        Arrays.fill(prev, true);
        
        for(int i=0; i<N+1; i++){
            boolean[] curr = new boolean[sum+1];
            
            for(int j=0; j<sum+1; j++){
                if((i==0 || i!=0) && j==0) curr[j] = true;
                else if(i==0 && j!=0) curr[j] = false;
                else
                    if(arr[i-1] <= j) curr[j] = prev[j] || prev[j-arr[i-1]];
                    else curr[j] = prev[j];
            }
            prev = curr;
        }
        
        return prev[sum];
   }
}