class Solution {
    public boolean canReorderDoubled(int[] arr) {
        Map<Integer, Integer> map = new TreeMap<>();

        for(int i=0; i<arr.length; i++){
            int val = arr[i];
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        for(int key: map.keySet()){
            if(map.get(key) == 0) continue;
            if(key<0 && key%2 != 0) return false;
            
            int tar = key<0 ? key/2 : key*2;
            
            if(map.get(key) > map.getOrDefault(tar, 0)) return false;
            map.put(tar, map.get(tar) - map.get(key));
        }

        return true;
    }
}