class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long max =(long)1e14, min =1;
        long ans =-1;
        while(max >= min){
            long mid = (max + min)/2;
            if(solve(mid, totalTrips, time)){
                ans = mid;
                max = mid - 1;
            } else min = mid + 1;
        }
        
        return ans;
    }

    static boolean solve(long t, long tri, int ti[]) {
        for(int i=0; i<ti.length; i++){
            long v = t/(long)ti[i];
            tri -= v;
            if(tri <= 0) return true;
        }
        
        return false;
    }
}