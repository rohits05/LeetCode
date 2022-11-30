class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        if(arr == null || arr.length == 0) return true;
        
        Map<Integer, Integer> mapy = new HashMap<>();
        for(int i=0; i<arr.length; i++)
            mapy.put(arr[i], mapy.getOrDefault(arr[i], 0) + 1);
        
        Set<Integer> result = new HashSet<>(mapy.values());
        return result.size() == mapy.size();
    }
}