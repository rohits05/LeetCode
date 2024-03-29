class Solution {
    public boolean canReach(int[] arr, int start) {
        // return canReachRec(start, arr, new Boolean[arr.length]);
        if(start<0 || start>=arr.length || arr[start]<0) return false;
        if(arr[start] == 0) return true;
        arr[start] = -1 * arr[start];
        return canReach(arr, start-arr[start]) || canReach(arr, start+arr[start]);
    }
    
    private boolean canReachRec(int i, int[] A, Boolean memo[]) {
        if(i < 0 || i >= A.length) return false;
        if(A[i] == 0) return true;
        if(memo[i] != null) return memo[i];
        
        // Looping Back Avoidance
        memo[i] = false; 
        memo[i] = canReachRec(i + A[i], A, memo) || canReachRec(i - A[i], A, memo);
        return memo[i];
    }
}