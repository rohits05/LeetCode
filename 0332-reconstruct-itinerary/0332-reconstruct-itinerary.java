class Solution {
    private HashMap<String, PriorityQueue<String>> map = new HashMap<>(); 
    private LinkedList<String> res = new LinkedList<>();

    public List<String> findItinerary(List<List<String>> tickets) { 
        for(List<String> ticket: tickets){ 
            String start = ticket.get(0), end = ticket.get(1);
            PriorityQueue<String> destinations = map.getOrDefault(start, new PriorityQueue<>());
            destinations.offer(end);
            map.put(start, destinations);
        }

        dfs("JFK");
        return res;
    }

    private void dfs(String src) { 
        PriorityQueue<String> destinations = map.get(src);
        while(destinations!=null && destinations.size()>0){
            String next = destinations.poll();
            dfs(next);
        }
        
        res.addFirst(src);
        return;
    }
}