class Solution {  
    public boolean isAlienSorted(String[] words, String order) {
        String prev = words[0];
        
        for(int i=1; i<words.length; i++){
            if(compare(words[i], prev, order) < 0) return false;
            prev = words[i];
        }
        
        return true;
    }
    
    public int compare(String s1, String s2, String order) {
        int n = Math.min(s1.length(), s2.length());
        
        for(int i=0; i<n; i++){
            int index1 = order.indexOf(s1.charAt(i)),
            index2 = order.indexOf(s2.charAt(i));
            if(index1 != index2) return Integer.compare(index1, index2);
        }
        
        return Integer.compare(s1.length(), s2.length());
    }
}