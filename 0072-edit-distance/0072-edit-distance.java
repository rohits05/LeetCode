class Solution {
    public int minDistance(String word1, String word2) {
        int opt[][] = new int[word1.length()+1][word2.length()+1];
        opt[0][0] = 0;
        for(int i=0; i<word1.length(); i++) opt[i+1][0] = i+1;
        for(int j=0; j<word2.length(); j++) opt[0][j+1] = j+1;
        
        for(int i=0; i<word1.length(); i++)
            for(int j=0; j<word2.length(); j++)
                opt[i+1][j+1] = word1.charAt(i) 
                == word2.charAt(j) ? opt[i][j] : Math.min(Math.min(opt[i][j],
                                                 opt[i+1][j]), opt[i][j+1]) + 1;
        
        return opt[word1.length()][word2.length()];
    }
}