class Solution {
    public boolean isAnagram(String a, String b) {
//        char arr[]=a.toCharArray();
//        char arr1[]=b.toCharArray();
        
//        Arrays.sort(arr);
//        Arrays.sort(arr1);
        
//        if(arr.length != arr1.length)
//            return false;
//        else{
//            for(int i=0; i<arr.length; i++) {
//                if(arr[i]!=arr1[i]) return false;
//            }
//            return true;
//        }
        int n =a.length(), m =b.length();
        if(n != m) return false;
        else{
            int cnt[] = new int[26];
            int len =cnt.length;
            for(int i=0; i<n; i++) cnt[a.charAt(i) - 'a']++;
            for(int i=0; i<m; i++) cnt[b.charAt(i) - 'a']--;
            
            for(int i=0; i<len; i++) if(cnt[i] != 0) return false;
        }
        return true;
    }
}