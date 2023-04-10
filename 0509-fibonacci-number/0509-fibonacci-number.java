class Solution {
    public int fib(int n) {
        if(n <= 1) return n;
        int p2 = 0, p1 = 1; // Spcae optimized!1
        for(int i=2; i<=n; i++){
            int cur = p1 + p2;
            p2 = p1; p1 = cur;
        }
        return p1;
    }
}