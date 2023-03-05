class Solution {
    public int minJumps(int[] arr) {
        int n =arr.length-1,steps =0;
        Map<Integer,Queue<Integer>> m = new HashMap<>();
        
        for(int i=0; i<=n; i++){
            if(!m.containsKey(arr[i])) m.put(arr[i], new LinkedList<>());
            if(i != n) m.get(arr[i]).add(i);
        }
        
        Queue<Integer> q = new LinkedList<>();
        q.add(n);
        boolean vis[] = new boolean[n+1];
        vis[n] = true;
        
        while(!q.isEmpty()){
            steps++;
            for(int size=q.size()-1; size>-1; size--){
                int ind = q.poll();
                Queue<Integer> t = m.get(arr[ind]);
                if(ind<n && !vis[ind+1]) t.add(ind+1);
                if(ind>0 && !vis[ind-1]) t.add(ind-1);
                
                while(!t.isEmpty()){
                    int nextInd = t.poll();
                    if(nextInd == 0) return steps;
                    else if(!vis[nextInd]){
                        vis[nextInd] = true;
                        q.add(nextInd);
                    }
                }           
            }
        }
        
        return 0;
    }
}