class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low =Integer.MAX_VALUE, high =0, n =weights.length;
        for(int val: weights){
            low = Math.min(low,val);
            high += val;
        }
        
        while(low <= high){
            int mid = low + ((high - low)/2);
            int count = 0 , load = 0;
            for(int i=0; i<n ; i++){
                if(load  + weights[i] <= mid) load += weights[i];
                else{
                    count++;
                    load = 0;
                    if(load  + weights[i] <= mid) load += weights[i];
                    else{ count = Integer.MAX_VALUE; break; }
                }
            }
            
            if(count < days-1) high = mid-1;
            else if(count > days -1) low = mid + 1;
            else high = mid -1;
        }
        
        return low;
    }
}