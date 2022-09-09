class Solution {
public:
    int majorityElement(vector<int>& nums) {
        // Moore Voting Algo
        int cnt =0, candy =0;
        for(auto items: nums){
            if(cnt ==0) candy = items;
            if(items == candy) cnt +=1;
            else cnt -=1;
        }
        return candy;
    }
};