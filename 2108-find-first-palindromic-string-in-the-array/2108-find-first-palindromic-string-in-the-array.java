class Solution {
    public String firstPalindrome(String[] words) {
        for(String items: words){
            if(isPalindrome(items)) return items;
        }

        return "";
    }
    
    private boolean isPalindrome(String s) {
        int start = 0, end = s.length() - 1;

        while(start < end){
            if(s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }

        return true;
    }
}