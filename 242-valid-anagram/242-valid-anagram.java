class Solution {
    public boolean isAnagram(String a, String b) {
       char arr[]=a.toCharArray();
       char arr1[]=b.toCharArray();
        
       Arrays.sort(arr);
       Arrays.sort(arr1);
        
       if(arr.length != arr1.length) { 
           return false;
       } else {
           for(int i=0; i<arr.length; i++) {
               if(arr[i]!=arr1[i])
                   return false;
           }
           return true;
       }
    }
}