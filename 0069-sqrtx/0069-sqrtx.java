class Solution {
    public int mySqrt(int x) {
        long low =0, high =x;
        
        while(low +1 < high){
            long mid = low + (high - low)/2;
            long sqr = mid * mid;
            if(sqr < x) low = mid;
            else if(sqr > x) high = mid;
            else return (int)mid;
        }
        
        long esqr = high * high;
        if(esqr == x) return (int)high;
        return (int)low;
    }
}