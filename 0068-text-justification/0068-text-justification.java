class Solution {
    public String addSpace(int n) {
        StringBuilder sb = new StringBuilder();
        for(int j=0; j<n; j++) sb.append(" ");
        return sb.toString();
    }
    
    public List<String> fullJustify(String[] words, int maxWidth) {
        int n = words.length;
        List<String> res = new ArrayList<>();
        if(n==0 || maxWidth==0) return res;

        int i = 0;
        while(i < n){
            List<String> text = new ArrayList<String>();
            int j =i, cnt =0, text_len =0;
            while(j < n){
                String curr = words[j];
                if(cnt + curr.length() <= maxWidth){
                    text.add(curr);
                    cnt = cnt + curr.length();
                    text_len = text_len + curr.length();
                    if(cnt+1 <= maxWidth) cnt++;
                    else{
                        j++;
                        break;
                    }
                }else break;
                j++;
            }
            i = j;
            res.add(construct(text, maxWidth-text_len, i==n)); 
        }
        
        return res;
    }

    public String construct(List<String> text, int left, boolean isLastRow) {
        StringBuilder sb = new StringBuilder();
        int len =text.size();
        
        if(isLastRow){
            for(int i=0; i<len; i++){
                sb.append(text.get(i));
                if(i != len-1){
                    sb.append(" ");
                    left--;
                }else sb.append(addSpace(left));
            }
            
        }else{
            if(len == 1){
                sb.append(text.get(0));
                sb.append(addSpace(left));
            }else{
                int space = left/(len-1), extra = left%(text.size()-1);
                
                for(int i=0; i<len; i++){
                    sb.append(text.get(i));
                    if(i != len - 1){
                        sb.append(addSpace(space));
                        if(extra != 0){
                            sb.append(" ");
                            extra--;
                        }
                    }
                }
            }
        }
        
        return sb.toString();
    }
}