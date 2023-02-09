class Solution {
    public int connectTwoGroups(List<List<Integer>> cost) {
        int n =cost.size(), m =cost.get(0).size();
        int inf = (int)1e9;
        int[][] res = new int[m+1][1<<n];
        
        for(int i=0; i<=m; i++) Arrays.fill(res[i], inf);
        res[0][0] = 0;
        
        for(int j=0; j<m; j++)
            for(int mask=0; mask<1<<n; mask++)
                for(int i=0; i<n; i++){
                    res[j+1][mask|1<<i] = Math.min(res[j+1][mask|1<<i], 
                                          res[j][mask] + cost.get(i).get(j));
                    res[j+1][mask|1<<i] = Math.min(res[j+1][mask|1<<i], 
                                          res[j+1][mask] + cost.get(i).get(j));
                }
        
        return res[m][(1<<n)-1];
    }
}