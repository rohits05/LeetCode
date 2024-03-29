class Solution {
public:
    vector<int> findClosestElements(vector<int>& arr, int k, int x) {
        int left = 0,right = arr.size()-1;
        
        while(right-left+1 > k){ 
            if(arr[right]-x < x-arr[left]) left++;
            else right--;
        }
        
        return vector<int>(arr.begin() + left, arr.begin() + right + 1);
    }
};