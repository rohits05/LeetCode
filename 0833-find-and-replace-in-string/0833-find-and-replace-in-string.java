class Solution {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        int N = s.length(), K = indices.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<K; i++){
            if(s.startsWith(sources[i], indices[i])) map.put(indices[i], i);
        }
        
        StringBuilder sb = new StringBuilder();
        int i =0;
        while(i < N){
            Integer id = map.get(i);
            if(id != null){
                sb.append(targets[id]);
                i += sources[id].length();
            }else{
                sb.append(s.charAt(i));
                i++;
            }
        }
        
        return sb.toString();
    }
}