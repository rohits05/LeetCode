class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        int idx =0, n =groupSizes.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            if(hm.containsKey(groupSizes[i])){
                int bi = hm.get(groupSizes[i]);
                if(ans.get(bi).size() < groupSizes[i]) ans.get(bi).add(i);
                else{
                    hm.put(groupSizes[i], idx++);
                    List<Integer> l = new ArrayList<>();
                    l.add(i); ans.add(l); 
                }
            }else{
                hm.put(groupSizes[i], idx++);
                List<Integer> l = new ArrayList<>();
                l.add(i); ans.add(l);
            }
        }
        
        return ans;
    }
}