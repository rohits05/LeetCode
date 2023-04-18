class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[]fin = new char[word1.length() + word2.length()];
        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();
        int i =0,j =0,k =0;
        while(i < w1.length || j < w2.length){
             if(i != w1.length ){
                   fin[k]=w1[i];
                   i++; k++;
               }if(j != w2.length ){
                   fin[k]=w2[j];
                   j++; k++;
               }
           }
        
        String s = new String(fin);
        return (s);
    }
}