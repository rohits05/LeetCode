class Solution {
public:
    vector<vector<int>> kClosest(vector<vector<int>>& points, int k) {
        int len = points.size(), dist;
        vector<pair<int, pair<int, int>>> vimz;

        for(auto items: points){
            dist = items[0] * items[0] + items[1] * items[1];
            vimz.push_back({dist,{items[0], items[1]}});
        }
        sort(vimz.begin(), vimz.end());
        
        vector<vector<int>> res(k);
        for(int i=0; i<k; i++){
            res[i].push_back(vimz[i].second.first);
            res[i].push_back(vimz[i].second.second);
        }
        
        return res;
    }
};