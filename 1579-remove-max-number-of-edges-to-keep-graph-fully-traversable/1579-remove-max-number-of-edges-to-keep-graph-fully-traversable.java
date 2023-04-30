class Solution {
    public int maxNumEdgesToRemove(int n, int[][] edges) {
        int[] p = new int[n + 1];
        int[] r = new int[n + 1];
        
        for(int i=0; i<p.length; i++){ p[i] = i; r[i] = 0; }
        
        int removals = 0, e1 = 0, e2 = 0;
        for(int[] edge: edges){
            if(edge[0] == 3){
                boolean check = union(p, r, edge[1], edge[2]);
                if(!check) removals += 1;
                else { e1 += 1; e2 += 1; }
            }
        }
        
        int[] p1 = p.clone();
        int[] r1 = r.clone();
        for(int[] edge: edges){
            if(edge[0] == 1){
                boolean check = union(p1, r1, edge[1], edge[2]);
                if(!check) removals += 1;
                else e1 += 1;
            }
        }
        
        int[] p2 = p.clone();
        int[] r2 = r.clone();
        for(int[] edge: edges){
            if(edge[0] == 2){
                boolean check = union(p2, r2, edge[1], edge[2]);
                if(!check) removals += 1;
                else e2 += 1;
            }
        }
        
        if(e1 != n-1 || e2 != n-1) return -1;
        
        return removals;
    }
    
    public int find(int[] p, int x) {
        if(p[x] == x) return x;
        else{
            p[x] = find(p, p[x]);
            return p[x];
        }
    }
    
    public boolean union(int[] p, int[] r, int x, int y) {
        int xl = find(p, x), yl = find(p, y);
        
        if(xl == yl) return false;
        
        if(r[xl] < r[yl]) p[xl] = yl;
        else if(r[yl] < r[xl]) p[yl] = xl;
        else{
            p[xl] = yl;
            r[yl] += 1;
        }
        
        return true;
    }
}