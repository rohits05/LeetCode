class Solution {
    private List<Integer>[] buildGraph(int n, int[][] edges) {
        List<Integer>[] graph = new ArrayList[n];
        for(int i=0; i<n; i++) graph[i] = new ArrayList<Integer>();
        for(int[] edge: edges) graph[edge[0]].add(edge[1]);
        
        return graph;
    }
    
    public int largestPathValue(String colors, int[][] edges) {
        int len = colors.length();
        List<Integer>[] graph = buildGraph(len, edges);

        int[] frequencies = new int[26];
        HashMap<Integer, int[]> calculatedFrequencies = new HashMap<>();
        
        int[] status = new int[len];
        for(int i=0; i<len; i++){
            if(status[i] != 0) continue;

            int[] localMax = runDFS(graph, i, calculatedFrequencies, status, colors);
            if(localMax[26] == -1){
                Arrays.fill(frequencies, -1);
                break;
            }else{
                for(int color=0; color<26; color++)
                    frequencies[color] = Math.max(frequencies[color], localMax[color]);
            }
        }
        
        int max = Integer.MIN_VALUE;
        for(int freq: frequencies) max = Math.max(max, freq);
        
        return max;
    }
    
    private int[] runDFS(List<Integer>[] graph, int node, HashMap<Integer, int[]> calculatedFrequencies, int[] status, String colors) {
        if(calculatedFrequencies.containsKey(node)) return calculatedFrequencies.get(node);

        int[] frequencies = new int[27];
        if(status[node] == 1){
            frequencies[26] = -1;
            return frequencies;
        }

        status[node] = 1;
        for(int neighbour: graph[node]){
            int[] localMax = runDFS(graph, neighbour, calculatedFrequencies, status, colors);
            
            if(localMax[26] == -1) return localMax;
            for(int i=0; i<26; i++)
                frequencies[i] = Math.max(frequencies[i], localMax[i]);
        }
        status[node] = 2;
        
        int color = colors.charAt(node) - 'a';
        frequencies[color]++;
        calculatedFrequencies.put(node, frequencies);
        
        return frequencies;
    }
}