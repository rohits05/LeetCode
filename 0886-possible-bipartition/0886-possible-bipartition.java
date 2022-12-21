class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        
        for(int i=0; i<n+1; i++) res.add(new ArrayList<>());
        
        for(int[] dis:dislikes){
            res.get(dis[0]).add(dis[1]);
            res.get(dis[1]).add(dis[0]);
        }
        
        int[] colors = new int[n+1];
        for (int i=0; i<n+1; i++){
            if (colors[i] == 0){ 
                Queue<Integer> q = new ArrayDeque<>();
                q.add(i);
                colors[i] = 1; 

                while(!q.isEmpty()){
                    int rm = q.remove(); 
                    for(int g: res.get(rm)){
                        if(colors[g] == 0){ 
                            colors[g] = -colors[rm]; 
                            q.add(g);
                        }else if(colors[g]==colors[rm]) return false;
                    }
                }
            }
        }
        return true;
    }
}