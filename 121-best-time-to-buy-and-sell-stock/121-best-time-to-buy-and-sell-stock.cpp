class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int profit = 0;
        int minI = INT_MAX;
        
        for(int i=0; i<prices.size(); i++){
            if(prices[i] < minI) 
                minI = prices[i];
            else if(prices[i] - minI > profit)
                profit = prices[i] - minI;
        }
        return profit;
    }
};