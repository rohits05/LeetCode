class Solution {
    public int numberOfGoodPaths(int[] vals, int[][] edges) {
        final int n = vals.length;
        List<Integer>[] adjs = new List[n];
        Map<Integer, List<Integer>> sortedVals = new TreeMap<>();
        for(int i=0; i<n; i++){
            adjs[i] = new ArrayList<>();
            sortedVals.computeIfAbsent(vals[i], k -> new ArrayList<>()).add(i);
        }

        for(int[] edge: edges){
            if(vals[edge[1]] <= vals[edge[0]]) adjs[edge[0]].add(edge[1]);
            if(vals[edge[0]] <= vals[edge[1]]) adjs[edge[1]].add(edge[0]);
        }

        int result = 0;
        FindUnion findUnion = new FindUnion(n);
        for(int val: sortedVals.keySet()){
            List<Integer> nodes = sortedVals.get(val);
            for(int node: nodes){
                for(int adj: adjs[node]) findUnion.union(node, adj);
            }

            Map<Integer, Integer> componentCount = new HashMap<>();
            for(int node: nodes){
                int root = findUnion.find(node);
                componentCount.put(root, componentCount.getOrDefault(root, 0) + 1);
            }

            int total = nodes.size();
            for(int component: componentCount.keySet()){
                int count = componentCount.get(component);
                total += count * (count - 1) / 2;
            }
            result += total;
        }

        return result;
    }

    static class FindUnion {
        int[] root; int[] rank;

        FindUnion(int n){
            root = new int[n];
            rank = new int[n];
            for (int i=0; i<n; i++){
                root[i] = i;
                rank[i] = 1;
            }
        }

        int find(int n){
            if(root[n] == n) return n;
            return root[n] = find(root[n]);
        }

        public boolean union(int a, int b){
            int x = find(a), y = find(b);
            if(x == y) return false;

            if(rank[x] > rank[y]) root[y] = x;
            else if (rank[x] < rank[y]) root[x] = y;
            else{
                rank[x]++;
                root[y] = x;
            }
            return true;
        }
    }
}