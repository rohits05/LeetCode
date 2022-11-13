class Solution {
    public String reverseWords(String s) {
        // String res = "";
        // int n = s.length();
        // int i = 0, j;
        // String word = "";
        // while(i<n){
        //     while(i<n && s.charAt(i) == ' '){
        //         i++;
        //     }
        //     j = i+1;
        //     while(j<n && s.charAt(j) != ' '){
        //         j++;
        //     }
        //     if(i < n && j<n+1){
        //         word = s.substring(i, j);
        //     if(res == "")
        //         res = word;
        //     else
        //         res = word+" "+res;
        //     }                        
        //     i = j+1;            
        // }
        // return res; 
        
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