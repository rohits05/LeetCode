class Solution {
    public int minimumOperations(int[] nums, int start, int goal) {
        Deque<Integer> q = new ArrayDeque<>();
        Set<Integer> visited = new HashSet<>();
        int ops = 1;
        for(int n: nums){
            for(int next: new int[]{goal - n, goal+n, goal^n}){
                if(next >= 0 && next <= 1000 && visited.add(next)) q.addLast(next);
            }
        }
        
        while(!q.isEmpty()){
            int sz = q.size();
            for(int i=0; i<sz; i++){
                int cand = q.removeFirst();
                if(cand == start) return ops;
                
                for(int n: nums){
                    for(int next: new int[]{cand - n, cand + n, cand ^ n}){
                        if(next >= 0 && next <= 1000 && visited.add(next)) q.addLast(next);
                    }
                }
            }
            ops++;
        }
        
        return -1;
    }
}