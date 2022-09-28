class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer> winner = new HashMap<>();
        HashMap<Integer,Integer> loser = new HashMap<>();
        
        for(int i=0;i<matches.length;i++){
            winner.put(matches[i][0],winner.getOrDefault(matches[i][0],0)+1);
            loser.put(matches[i][1],loser.getOrDefault(matches[i][1],0)+1);
        }
        
        List<Integer> l1 = new ArrayList<>();
        for(int val:winner.keySet()){
            if( winner.get(val) >0 && !loser.containsKey(val) ){
                l1.add(val);
            }
        }
        
        List<Integer> l2 = new ArrayList<>();
        for(int val:loser.keySet()){
            if(loser.get(val) == 1 ){
                l2.add(val);
            }
        }
        
        List<List<Integer>> list = new ArrayList<>();
        Collections.sort(l1);
        Collections.sort(l2);
        list.add(l1);
        list.add(l2);
        return list;
    }
}