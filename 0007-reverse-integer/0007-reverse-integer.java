class Solution {
    public int reverse(int x) {
        int maxI = Integer.MIN_VALUE, minI = Integer.MAX_VALUE;
        long ans = 0;
        
        while(x != 0){
            int dig = x%10;
            ans = ans*10 + dig;
            x /= 10;
        }
        
        if(ans<maxI || ans>minI) return 0;
        return (int)ans;
    }
}