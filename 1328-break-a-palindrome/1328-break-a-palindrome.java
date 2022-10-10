class Solution {
    public String breakPalindrome(String palindrome) {
        if(palindrome.length() <= 1) return new String();
        int n = palindrome.length();
        
        StringBuilder sb = new StringBuilder(palindrome);
        for(int i=0; i<n/2; i++){
            if(palindrome.charAt(i)!='a'){
              sb.setCharAt(i , 'a');
               return sb.toString();
            }
        }
        
        sb.setCharAt(n-1 , 'b');
        return sb.toString();
    }
}