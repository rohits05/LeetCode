class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int max_profit = 0;
        int min_price = INT_MAX;
        
        for(int i=0; i<prices.size(); i++){
            // if(prices[i] < minI) 
            //     minI = prices[i];
            // else if(prices[i] - minI > profit)
            //     profit = prices[i] - minI;
            min_price = min(min_price, prices[i]);
            max_profit = max(max_profit, prices[i]-min_price);
        }
        return max_profit;
    }
};