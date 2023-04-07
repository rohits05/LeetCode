class Solution {
    public int largestIsland(int[][] grid) {
        int n =grid.length;
        DisJointSet ds = new DisJointSet(n * n); 
        int[] x= {0, 1, 0, -1}, y={1, 0, -1, 0};
        
        for(int i=0; i<n; i++){ // Connecting components for maxG cal!!
            for(int j=0; j<n; j++){
                if(grid[i][j] == 0) continue;
                 for(int k=0; k<4; k++){
                      int nr = i + x[k];
                      int nc = j + y[k];
                      if(isValid(nr, nc, n) && grid[nr][nc] == 1){
                          int cellR = (i * n) + j;
                          int cellC = (nr * n) + nc;
                          ds.unionBySize(cellR, cellC);
                      }
                  }
              }
          }

        int maxGroup =0;
        for(int i=0; i<n; i++){ // Conversion ~ 0 -> 1!
            for(int j=0; j<n; j++){
                if(grid[i][j] == 1) continue;
                Set<Integer> set = new HashSet<>();
                for(int k=0; k<4; k++){
                      int nr = i + x[k];
                      int nc = j + y[k];
                      if(isValid(nr, nc, n) && grid[nr][nc] == 1){
                          int cellC = (nr * n) + nc;
                          set.add(ds.findUParent(cellC));
                      }
                  }
                  int temSize =0;
                  for(int f: set) temSize += ds.size[f];
                  maxGroup = Math.max(maxGroup, temSize + 1);
              }
          }
        // Getting Ultimate parent!
        for(int i=0; i<n*n; i++) maxGroup = Math.max(maxGroup, ds.size[ds.findUParent(i)]);
        return maxGroup;
    }
    
    private boolean isValid(int i,int j,int n) {
        return (i>=0 && i<n && j>=0 && j<n); // It Lies inside the grid!
    }
    
}

public class DisJointSet {
    protected int[] parent;
    protected int[] rank;
    protected int[] size;
    protected int length;

    DisJointSet(int n) {
        this.parent = new int[n + 1];
        this.rank = new int[n + 1];
        this.size = new int[n + 1];
        this.length = n + 1;
        for(int i=0; i<=n; i++){
            parent[i] = i;
            size[i] = 1;
        }
    }

    public int findUParent(int node) {
        if (node == parent[node]) return node;
        return parent[node] = findUParent(parent[node]); // path compression
    }

    public void unionByRank(int u, int v) {
        int ultimateU = findUParent(u);
        int ultimateV = findUParent(v);
        if(ultimateV == ultimateU) return; //is both are same compenent
        if(rank[ultimateU] < rank[ultimateV])
            parent[ultimateU] = ultimateV;
        else if(rank[ultimateV] < rank[ultimateU])
            parent[ultimateV] = ultimateU;
        else{
            parent[ultimateU] = ultimateV;
            rank[ultimateV]++;
        }
    }

    public void unionBySize(int u, int v) {
        int ultimateU = findUParent(u);
        int ultimateV = findUParent(v);
        if(ultimateV == ultimateU) return;
        if(size[ultimateU] < size[ultimateV]){
            parent[ultimateU] = ultimateV;
            size[ultimateV] += size[ultimateU];
        }else{
            parent[ultimateV] = ultimateU;
            size[ultimateU] += size[ultimateV];
        }
    }
}