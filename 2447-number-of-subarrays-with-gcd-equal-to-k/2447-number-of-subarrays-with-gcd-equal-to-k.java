class Solution {
    static int gcd(int a,int b) {
        if(a == 0) return b;
        if(b == 0) return a;
        return gcd(b, a%b);
    }
    
    public int subarrayGCD(int[] nums, int k) {
        int c =0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] == k)  c++;
            int xx = 0;
            for(int j=i+1; j<nums.length; j++){
                if(j==i+1) xx = gcd(nums[i], nums[j]);
                else xx = gcd(xx, nums[j]);
                
                if(xx == k) c++;
                else if(xx < k)  break;
            }
        }
        
        return c;
    }
}