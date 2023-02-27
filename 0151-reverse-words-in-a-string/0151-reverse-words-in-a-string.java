class Solution {
    public String reverseWords(String s) {
//        String ans ="";
//        String[] words = s.trim().split(" +");
//           for(int i=words.length-1; i>=0;i--){
//               ans += words[i];
//               if(i != 0) ans += " ";
//           }
        
//        return ans;
        
        // Using String-Builder!
        String[] words = s.split(" ");
        StringBuilder dev = new StringBuilder();
        for(int i=words.length-1; i>=0; i--) {
            if(words[i] != "") {
                dev.append(words[i].trim() + " ");
            }
        }

        return dev.toString().trim();
    }
}