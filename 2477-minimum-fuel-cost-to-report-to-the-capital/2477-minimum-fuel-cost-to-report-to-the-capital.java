class Solution {
    long ans = 0;
    public long minimumFuelCost(int[][] roads, int seats) {
        int n = 0;
        for(int i=0; i<roads.length; i++) n = Math.max(n, Math.max(roads[i][0], roads[i][1]));
        n++;

        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0; i<n; i++) adj.add(new ArrayList<>());

        for(int i=0; i<roads.length; i++){
            adj.get(roads[i][0]).add(roads[i][1]);
            adj.get(roads[i][1]).add(roads[i][0]);
        }
        
        int visited[] = new int[n];
        int x=dfs(0, adj, visited, seats, 0);

        return ans;
    }

    public int dfs(int curr,List<List<Integer>> adj,int visited[],int maxCap,int len){
        visited[curr] = 1;

        List<Integer> neigh = adj.get(curr);
        List<Integer> people = new ArrayList<>();

        for(int i=0; i<neigh.size(); i++){
            if(visited[neigh.get(i)] == 1) continue;
            
            int toAdd = dfs(neigh.get(i), adj, visited, maxCap, len+1);
            if(toAdd>0){
                ans++;
                people.add(toAdd);
            }
        }
         
         int car = 1;
         Collections.sort(people);

         for(int i=0; i<people.size(); i++){
            if(car + people.get(i) <= maxCap) car += people.get(i);
            else {
                ans += (long)len;

                if(car == maxCap) car = people.get(i);
                else car = people.get(i) - (maxCap-car);
            }
         }
         
         if(car == maxCap)
         ans += len;

         return car == maxCap ? 0 : car;
    }
}