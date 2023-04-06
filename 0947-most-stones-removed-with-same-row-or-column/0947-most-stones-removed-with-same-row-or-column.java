class Solution {
    class DisjointSet {
        ArrayList<Integer> parent = new ArrayList<Integer>();
        ArrayList<Integer> rank = new ArrayList<Integer>();
        public DisjointSet(int n) {
            for(int i=0; i<=n; i++){
                parent.add(i);
                rank.add(1);
            }
        }
        
        public int findParent(int ele) {
            if(ele == parent.get(ele)) return ele;
            
            int par = findParent(parent.get(ele));
            parent.set(ele,par);
            return parent.get(ele);
        }
        
        public void unionByRank(int u,int v) {
            int up = findParent(u), vp = findParent(v);
            int ru = rank.get(u), rv = rank.get(v);
            
            if(ru < rv) parent.set(up, vp);
            else if(ru > rv) parent.set(vp, up);
            else{
                parent.set(vp, up);
                rank.set(up, rank.get(up)+1);
            }
        } 
    }
    public int removeStones(int[][] stones) {
           int n =stones.length;
           int maxCol = Integer.MIN_VALUE, maxRow = Integer.MIN_VALUE;
           HashMap<Integer,Boolean> hm = new HashMap<>();
           for(int []arr: stones){
               maxCol = Math.max(maxCol, arr[1]);
               maxRow = Math.max(maxRow, arr[0]);
           }
        
           DisjointSet obj = new DisjointSet(maxRow+maxCol+1);
           for(int []arr: stones){
              int u = arr[0], v = arr[1]+maxRow+1;
              hm.put(u,true); hm.put(v, true);
              obj.unionByRank(u, v);
           }
           int count = 0;

           for(Map.Entry<Integer,Boolean> mp: hm.entrySet()){
               int ele = mp.getKey();
               if(ele == obj.findParent(ele)) count++;
           }

           return (n-count);
    }
}