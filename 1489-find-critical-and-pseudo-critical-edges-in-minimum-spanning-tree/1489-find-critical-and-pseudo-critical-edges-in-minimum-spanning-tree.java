class Solution {
    class UnionFind {
        private int cnt;
        private int[] parent;
        private int[] rank;

        public UnionFind(int n) {
            this.cnt = n;
            parent = new int[n];
            rank = new int[n];
            for(int i=0; i<n; i++){
                parent[i] = i;
                rank[i] = 1;
            }
        }

        public int find(int x) {
            if(parent[x] == x) return x;
            parent[x] = find(parent[x]);
            return parent[x];
        }

        public boolean union(int x, int y) {
            int a = find(x), b = find(y);

            if(a == b) return false;
            else if(rank[a] >= rank[b]){
                cnt--;
                rank[a] += rank[b];
                parent[b] = a;
            }else{
                cnt--;
                rank[b] += rank[a];
                parent[a] = b;
            }
            return true;
        }

        public boolean isConnected() {
            return cnt == 1;
        }
    }

    private int kruskal(int[][] e, int include, int exclude, int n) {
        UnionFind uf = new UnionFind(n);
        int val = 0;
        if(include >= 0){
            val = e[include][2];
            uf.union(e[include][0], e[include][1]);
        }

        for(int i=0; i<e.length; i++){
            if(i == exclude) continue;
            if(uf.union(e[i][0], e[i][1])) val += e[i][2];
        }

        if(uf.isConnected()) return val;
        return -1;
    }

    public List<List<Integer>> findCriticalAndPseudoCriticalEdges(int n, int[][] e) {
        int[][] edges = new int[e.length][4];
        for(int i=0; i<e.length; i++){
            edges[i][0] = e[i][0];
            edges[i][1] = e[i][1];
            edges[i][2] = e[i][2];
            edges[i][3] = i;
        }
        
        Arrays.sort(edges, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[2] - b[2];
            }
        });
        
        List<List<Integer>> res = new ArrayList<>();
        Set<Integer> criticals = new HashSet<>();
        List<Integer> pseudoCriticals = new ArrayList<>();
        int mst = kruskal(edges, 0, -1, n);

        for(int i=0; i<edges.length; i++){
            int val = kruskal(edges, -1, i, n);
            if(val > mst || val < 0) criticals.add(edges[i][3]);
        }

        for(int i=0; i<edges.length; i++){
            if(criticals.contains(edges[i][3])) continue;
            if(kruskal(edges, i, -1, n) == mst) pseudoCriticals.add(edges[i][3]);
        }
        res.add(new ArrayList<>(criticals));
        res.add(pseudoCriticals);
        return res;
    }
}