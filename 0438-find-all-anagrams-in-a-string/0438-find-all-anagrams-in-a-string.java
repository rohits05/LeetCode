class Solution {
    public List<Integer> findAnagrams(String s, String p) {
       List<Integer> list = new ArrayList<Integer>();
        int[] arr = new int[26];
        for(int i=0; i<p.length(); i++) arr[p.charAt(i) - 'a']++;
        
        for(int i=0; i<=s.length()-p.length(); i++){
            String temp = s.substring(i, p.length()+i);
            int[] arr1 = new int[26];
            
            for(int j=0; j<p.length(); j++) arr1[temp.charAt(j) - 'a']++;
            if(Arrays.equals(arr, arr1)) list.add(i);
        }
        return list;
    }
}