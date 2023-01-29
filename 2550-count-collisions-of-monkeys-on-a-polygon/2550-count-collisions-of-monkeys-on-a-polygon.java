class Solution {
    public int monkeyMove(int n) {
        int mod = (int)1e9 + 7;
        int ans = (pow(2, n, mod) + mod - 2)%mod;
        return ans;
    }

    public int pow(long x, long n, int mod) {
      long res = 1;

      while(n>0){
          if((n&1) != 0) res = (res * x%mod) % mod;
          x = (x%mod * x%mod) % mod;
          n = n>>1;
      }

      return (int)res;
    }
}