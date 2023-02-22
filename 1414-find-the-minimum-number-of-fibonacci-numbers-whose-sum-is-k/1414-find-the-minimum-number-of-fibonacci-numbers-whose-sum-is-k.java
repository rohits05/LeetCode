class Solution {
    public int findMinFibonacciNumbers(int k) {
        int ans = 0;

        while(k > 0){
            int fib2prev = 1, fib1prev = 1;
            while (fib1prev <= k){
                int temp = fib2prev + fib1prev;
                fib2prev = fib1prev;
                fib1prev = temp;
            }
            k -= fib2prev;
            ans += 1;
        }
        
        return ans;
    }
}