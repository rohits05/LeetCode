class Solution {
    public int characterReplacement(String s, int k) {
        int ans = 0;
        int maxI = 0;
        int count[] = new int[128];
        
        for (int i=0; i<s.length(); ++i) {
            maxI = Math.max(maxI, ++count[s.charAt(i)]);
            if (ans - maxI < k)
                ans++;
            else
                count[s.charAt(i - ans)]--;
        }
        return ans;
    }
}