class Solution {
    int[] odd = new int[26];
    int[] even = new int[26];
    public boolean checkStrings(String s1, String s2) {
        int n =s1.length(), m =s2.length();
        
        for(int i=0; i<n; i++){
            if(i%2 == 0){
                even[s1.charAt(i)-'a']++;
                even[s2.charAt(i)-'a']++;
            }else{
                odd[s1.charAt(i)-'a']++;
                odd[s2.charAt(i)-'a']++;
            }
        }
        
        for(int i=0; i<26; i++){
            if(odd[i] != 0 && odd[i]%2 != 0) return false;  
            if(even[i] != 0 && even[i]%2 != 0) return false;
        }
        
        return true;
    }
}