class Solution {
    int ans;
    int count[];

    public int distributeCookies(int[] cookies, int k) {
        ans = Integer.MAX_VALUE;
        count = new int[k];

        backtrack(0, cookies, k);
        return ans;
    }

    public void backtrack(int cookieNumber, int cookies[], int k) {
        int n =cookies.length, max = 0;;
        if(cookieNumber == n){
            for(int i=0; i<k; i++) max = Math.max(max, count[i]);
            ans = Math.min(ans, max);
            return;
        }

        for(int i=0; i<k; i++){
            count[i] += cookies[cookieNumber];
            backtrack(cookieNumber+1, cookies, k);
            count[i] -= cookies[cookieNumber];
            if(count[i] == 0) break;
        }
    }
}