class Solution {
    public double runDijkstras(int n, List<List<Edge>> graph, int start, int end) {
        PriorityQueue<Edge> priorityQueue = new PriorityQueue<Edge>((a, b) -> (b.succProb).compareTo(a.succProb));
        Double[] distance = new Double[n];
        Arrays.fill(distance, 0.0);
        distance[start] = 1.0;

        priorityQueue.add(new Edge(start, 1.0));

        while(!priorityQueue.isEmpty()){
            Edge u = priorityQueue.poll();
            for(int i=0; i<graph.get(u.label).size(); i++){
                Edge v = graph.get(u.label).get(i);
                if(distance[v.label] < distance[u.label] * v.succProb){
                    distance[v.label] = distance[u.label] * v.succProb;
                    priorityQueue.add(v);
                }
            }
        }
        
        return distance[end];
    }
    
   static class Edge {
        int label;
        Double succProb;

        public Edge(int label, Double succProb) {
            this.label = label;
            this.succProb = succProb;
        }
    }
    
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        List<List<Edge>> graph = new ArrayList<>(n);
        
        for(int i=0; i<n; i++) graph.add(new ArrayList<>());  

        for(int i=0; i<edges.length; i++){
            int v1 = edges[i][0], v2 = edges[i][1];
            graph.get(v1).add(new Edge(v2, succProb[i]));
            graph.get(v2).add(new Edge(v1, succProb[i]));
        }

        Double maxProbablity = runDijkstras(n, graph, start, end);
        return maxProbablity;
    }
}