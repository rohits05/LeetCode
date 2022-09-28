class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean seen[] = new boolean[rooms.size()];
        seen[0] = true;
        
        Stack<Integer> keys = new Stack();
        keys.add(0);
        
        while(!keys.isEmpty()){
            int curr = keys.pop();
            for(int new_keys: rooms.get(curr)){
                if(!seen[new_keys]){
                    seen[new_keys] = true;
                    keys.add(new_keys);
                }
            }
        }
        
        for(boolean visited: seen){
            if(!visited) return false;
        }
        return true;
    }
}