class Solution {
    public int subarrayLCM(int[] nums, int k) {
        int n = nums.length, ans = 0;
        
        for(int i=0; i<n; i++){
            int lcm = 1;
            for(int j=i; j<n; j++){
                lcm = lcm(lcm, nums[j]);
                if(lcm == k) ans++;
                if(lcm > k) break;
            }
        }
        
        return ans;
    }
    
    int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
    
    int gcd(int a, int b) {
        if(a == 0) return b;
        if(b == 0) return a;
        return gcd(b%a, a);
    }
}