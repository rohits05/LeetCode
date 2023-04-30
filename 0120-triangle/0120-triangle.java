class Solution {
    public int minimumTotal(List<List<Integer>> grid) {
         for(int i=grid.size()-2; i>=0; i--){
            for(int j=0; j<grid.get(i).size(); j++) 
                
                grid.get(i).set(j, grid.get(i).get(j) 
                + Math.min(grid.get(i + 1).get(j), grid.get(i + 1).get(j + 1)));
        }
        
        return grid.get(0).get(0);
    }
}