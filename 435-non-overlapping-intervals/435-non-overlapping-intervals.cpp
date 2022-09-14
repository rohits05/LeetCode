class Solution {
public:
    int eraseOverlapIntervals(vector<vector<int>>& intervals) {
        int n = intervals.size();
        int l =0, r =1, c =0;
        sort(intervals.begin(), intervals.end());
        
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
};