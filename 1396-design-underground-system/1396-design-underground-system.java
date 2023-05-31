class UndergroundSystem {
    Map<String, Map<String,int[]>> hm;
    Map<Integer, Map<String,Integer>> cust;
    public UndergroundSystem() {
        hm = new HashMap();
        cust = new HashMap();
    }
    
    public void checkIn(int id, String stationName, int t) {
        Map<String,Integer> map = new HashMap();
        map.put(stationName, t);
        cust.put(id, map);
    }
    
    public void checkOut(int id, String stationName, int t) {
        Map<String,Integer> map=cust.get(id);
        String start ="";
        int startTime =0;     
        for(String s: map.keySet()){
            start = s;
            startTime = map.get(s);
        }
        
        hm.putIfAbsent(start, new HashMap<>());
        Map<String,int[]> map2 = hm.get(start);
        map2.putIfAbsent(stationName, new int[2]);
        int arr[] = map2.get(stationName);
        arr[0] += (t-startTime); 
        arr[1]++;
    }
    
    public double getAverageTime(String startStation, String endStation) {
        int arr[] = hm.get(startStation).get(endStation);
        return (arr[0]*1.0) / arr[1];
        
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */