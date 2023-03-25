class Solution {
    // Topo ~~ Kahn's Algo!!
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        Queue<Integer> queue = new ArrayDeque<>();
        
        for(int i=0; i<numCourses; i++)
            graph.add(new ArrayList<Integer>());
        
        int[] indegree = new int[numCourses];
        for(int i=0; i<prerequisites.length; i++){
            int course = prerequisites[i][0], prere = prerequisites[i][1];
            indegree[course]++;
            graph.get(prere).add(course);
        }
        
        for(int i=0; i<numCourses; i++)
            if(indegree[i] == 0) queue.offer(i);
        
        int count = 0;
        while(!queue.isEmpty()){
            Integer prere = queue.poll();
            count++;
            for(Integer course: graph.get(prere)){
                indegree[course]--;
                if(indegree[course] == 0) queue.offer(course);
            }
        }
        return (count == numCourses);
    }
}