class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals) {
        vector<vector<int>> res;
        
        if(intervals.size() == 0) return res;
        
        sort(intervals.begin(), intervals.end());
        vector<int> temp = intervals[0];
        
        for(auto item: intervals){
            if(item[0] <= temp[1])  temp[1] = max(item[1], temp[1]);   
            else {res.push_back(temp); temp = item;}
        }   
        
        res.push_back(temp);
        return res;
    }
};