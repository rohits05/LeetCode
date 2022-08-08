class Solution {
public:
    int findMaxValueOfEquation(vector<vector<int>>& points, int k) {
        priority_queue<pair<int, int>> p;
        int res = INT_MIN;
        
        for(int i=0; i<points.size(); i++){
            while((!p.empty() && (points[i][0]-p.top().second>k)))
                p.pop();
            
            if(!p.empty())
                res = max(res, points[i][0]+points[i][1]+p.top().first); // prev & current possible answer 
            p.push({points[i][1]-points[i][0], points[i][0]}); // x-cordinates
        }
        return res;
    }
};