class Solution {
    public int lastRemaining(int n) {
        // return n == 1 ? 1 : 2 * (1 + n / 2 - lastRemaining(n / 2));
        
        // Josephus Approach !!
        int ans = 1;
        Stack<Integer> st = new Stack<>();
        while(n > 1){
            n /= 2;
            st.push(n);
        }
        
        while(!st.isEmpty()){
            ans = 2*(1 + st.pop() - ans);
        }
        return ans;
    }
}