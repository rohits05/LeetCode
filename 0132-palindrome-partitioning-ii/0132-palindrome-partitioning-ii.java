class Solution {
    public int minCut(String s) {
        int N = s.length();
        int [] dp = new int[N];
        for(int i=0; i<dp.length; i++) dp[i] = -1;
        return fun(0, s, dp)-1;
    }
    
    public boolean isPalindrome(String str, int start , int end){
        while(start < end){
            if(str.charAt(start) != str.charAt(end)) return false;
            start++;
            end--;
        }
        
        return true;
    }
    
    public int fun(int index, String s, int [] dp){
        if(index == s.length()) return 0;
        int partition = 0, min = Integer.MAX_VALUE;
        
        if(dp[index] != -1) return dp[index];
        
        for(int i=index; i<s.length(); i++){
            if(isPalindrome(s, index , i)){ // 
                partition = 1 + fun(i+1, s, dp);
            }   
            min = Math.min(min, partition);
        }
        
        return dp[index] = min;
    }
}