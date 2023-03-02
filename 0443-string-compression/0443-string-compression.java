class Solution {
    public int compress(char[] chars) {
        int n = chars.length, ans_ind = 0, i = 0;
        
        while(i < n){
            int j = i + 1;
            
            while(j < n && chars[i] == chars[j]) j++;
            chars[ans_ind++] = chars[i];
            int cnt = j - i;
            if(cnt > 1){
                String count = Integer.toString(cnt);
                for(char c: count.toCharArray()) chars[ans_ind++] = c;
            }
            i = j;
        }
        
        return ans_ind;
    }
}