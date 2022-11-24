class Solution {
    public boolean exist(char[][] b, String word) {
        for(int i=0; i<b.length; i++){
            for(int j=0; j<b[i].length; j++){
                if(b[i][j] == word.charAt(0) && dfs(b,i,j,0,word))
                    return true;
            }
        }
        return false;
    }
    
    public boolean dfs(char[][]b, int i, int j, int cnt, String word){
        if(cnt == word.length()) return true;
        if(i<0 || i>=b.length || j<0 || j>=b[i].length || b[i][j] != word.charAt(cnt))
            return false;
        
        char temp = b[i][j];
        b[i][j] = ' ';
        boolean found = dfs(b, i+1, j, cnt+1, word) ||
                        dfs(b, i-1, j, cnt+1, word) ||
                        dfs(b, i, j+1, cnt+1, word) ||
                        dfs(b, i, j-1, cnt+1, word); 
        b[i][j] = temp;
        return found;
    }
}