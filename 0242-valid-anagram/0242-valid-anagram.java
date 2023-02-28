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
        
        if(a.length() != b.length()) return false;
        
        else{
            int cnt[] = new int[26];
            for(int i=0; i<a.length(); i++) cnt[a.charAt(i) - 'a']++;
            for(int i=0; i<b.length(); i++) cnt[b.charAt(i) - 'a']--;
            
            for(int i=0; i<cnt.length; i++) if(cnt[i] != 0) return false;
        }
        return true;
    }
}