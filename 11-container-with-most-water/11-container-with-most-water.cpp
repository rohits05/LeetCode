class Solution {
public:
    int maxArea(vector<int>& height) {
        int i =0, j =height.size()-1;
        int water =0;
        
        while(i<j){
            int wdth = j-i;
            int hght = min(height[i], height[j]);
            water = max(water, hght*wdth);
            
            if(height[i] < height[j]) i++;
            else j--;
        }
        return water;
    }
};