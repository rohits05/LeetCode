class Solution {
    public String reverseWords(String s) {
//         Stack<String> st = new Stack<>();
//         String temp ="", ans ="";
//         int n =s.length();
        
//         for(int i=0; i<n; i++){
//             if(s.charAt(i) == ' '){
//                 if(temp.length() > 0) st.push(temp);
//                 temp = "";
//             }else temp += s.charAt(i);
//         }
//         ans += temp;
        
//         while(!st.isEmpty()) ans = ans + " " + st.pop();
//         if(ans.length() != 0 && ans.charAt(0) == ' ') ans = ans.substring(1);
//         return ans;
        
        // Using String-Builder!
        String[] words = s.split(" ");
        StringBuilder dev = new StringBuilder();
        int n = words.length;
        for(int i=n-1; i>=0; i--) if(words[i] != "") dev.append(words[i].trim() + " ");
        return dev.toString().trim();
    }
}