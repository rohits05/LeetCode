class Solution {
    static class DisjointSet{
        List<Integer> size = new ArrayList<>();
        List<Integer> parent = new ArrayList<>();
        
        public DisjointSet(int n){
            for(int i=0; i<n; i++){
                size.add(1);
                parent.add(i);
            }
        }

        int findUP(int node){
            if(node == parent.get(node)) return node;
            int up = findUP(parent.get(node));
            parent.set(node, up);
            return up;
        }

        void unionBySize(int u, int v){
            int pu = findUP(u), pv = findUP(v);
            
            if(pu == pv) return;
            if(size.get(u) < size.get(v)){
                parent.set(pu, pv);
                size.set(pv, size.get(pu)+size.get(pv));
            }else{
                parent.set(pv, pu);
                size.set(pu, size.get(pu)+size.get(pv));
            }
        }
    }

    public static int makeConnected(int n, int[][] connections){
        DisjointSet ds = new DisjointSet(n);
        int m = connections.length, extra = 0;
        for(int i=0; i<m; i++) {
            int u = connections[i][0], v = connections[i][1];
            if(ds.findUP(u) == ds.findUP(v)) extra++;
            else ds.unionBySize(u, v);
        }
        
        int component = 0;
        for(int i=0; i<n; i++){
            if(ds.parent.get(i) == i) component++;
        }
        
        int ans = component-1;
        if(extra < ans) return -1;
        else return ans;
    }
}