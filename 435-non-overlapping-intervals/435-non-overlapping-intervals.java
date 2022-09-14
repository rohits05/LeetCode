class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        int l =0, r =1, c =0;
        // Arrays.parallelSort(intervals);
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        
        while(r < n){
            if(intervals[l][1] <= intervals[r][0]){
                l = r;
                r += 1;
            } else if(intervals[l][1] <= intervals[r][1]){
                c += 1;
                r += 1;
            } else if(intervals[l][1] > intervals[r][1]){
                c += 1;
                l = r;
                r += 1;
            }
        }
        return c;
    }
}