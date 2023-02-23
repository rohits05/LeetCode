class Solution {
    int resIdx;
    boolean dfs(int[] res, Map<Integer, List<Integer>> adjList, int[] state, int course) {
        if(state[course] == 2) return false;
        if(state[course] == 1) return true; 
        state[course] = 1; 
        
        if(adjList.containsKey(course))
          for(int next: adjList.get(course))
            if(dfs(res, adjList, state, next)) return true;

        state[course] = 2; 
        res[resIdx--] = course;
        return false;
   }
    
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] state = new int[numCourses];
        Map<Integer, List<Integer>> adjList = new HashMap<>();
        
        for(int[] pre: prerequisites){
          int a = pre[0], b = pre[1];
          adjList.putIfAbsent(b, new ArrayList<>());
          adjList.get(b).add(a); 
        }
        
        int[] res = new int[numCourses];
        resIdx = numCourses - 1;
        for(int i=0; i<numCourses; i++)
          if(dfs(res, adjList, state, i)) return new int[] {};
        
        return res;
     }
} 