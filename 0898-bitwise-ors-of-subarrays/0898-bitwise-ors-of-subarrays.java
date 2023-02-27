class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        int len = arr.length;
        Set<Integer> set = new HashSet<>();
        
        for(int i=0; i<len; i++){
            set.add(arr[i]);
            for(int j=i-1; j>=0; j--){
                if((arr[i] | arr[j]) == arr[j]) break;
                arr[j] |= arr[i];
                set.add(arr[j]);
            }
        }
        
        return set.size();
    }
}