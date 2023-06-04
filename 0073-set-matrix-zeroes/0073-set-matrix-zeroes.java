class Solution { 
    public void setZeroes(int[][] mat) {
        int n =mat.length, m =mat[0].length;
        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();
        
        for(int i=0; i<n; i++){ // Finding specific R & C with 0's!
           for(int j=0; j<m; j++){
               if(mat[i][j] == 0){
                    row.add(i); 
                    col.add(j);
               }
           }
        } 
        
        for(int r: row){
            for(int j=0; j<m; j++) mat[r][j] = 0; // Setting that row as 0!
        }
        
        for(int c: col){
            for(int i=0; i<n; i++) mat[i][c] = 0; // Setting that col as 0!
        }
    }
}