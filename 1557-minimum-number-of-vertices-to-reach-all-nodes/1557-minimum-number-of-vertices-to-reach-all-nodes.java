class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<Integer>[] res = new ArrayList[n];
        
        for(int i=0; i<n; i++){
            res[i] = new ArrayList();
        }
        
        int inDeg[] = new int[n];
        for(List<Integer> e: edges){
            res[e.get(0)].add(e.get(1));
            inDeg[e.get(1)]++;
        }
        
        List<Integer> tmp = new ArrayList();
        for(int i=0; i<n; i++){
            if(inDeg[i] == 0) tmp.add(i);
        }
        return tmp;
    }
}