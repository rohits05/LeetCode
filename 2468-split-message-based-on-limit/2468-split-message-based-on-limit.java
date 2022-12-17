class Solution {
    public List<String> fun(String str,int limit,int digits){
        List<String> ans=new ArrayList();
        int parts = 1, i = 0;
        String digit = "";
        for(int idx=0; idx<digits; idx++) digit = digit + "-";
        while(i < str.length()){
            String suffixLength = "<" + parts + "/" + digit + ">";
            parts++;
            int currLength = limit - suffixLength.length();
            if(currLength <= 0) return new ArrayList();
            String charLeft = "";
            while(i<str.length() && currLength-->0){
                charLeft = charLeft + str.charAt(i);
                i++;
            }
            ans.add(charLeft);
        }
        
        if(String.valueOf(parts-1).length() != digits)  return new ArrayList();
        String length = String.valueOf(parts - 1);
        parts = 1;
        int idx = 0;
        for(String curr: ans){
            String suffix = "<" + parts + "/" + length + ">";
            parts++;
            curr = curr + suffix;
            ans.set(idx, curr);
            idx++;
        }
        return ans;
    }
    
    public String[] splitMessage(String message, int limit) {
        for(int i=1; i<5; i++){
            List<String> curr=fun(message,limit,i);
            if(curr.size() != 0){
                String[] ans = new String[curr.size()];
                for(int j=0; j<curr.size(); j++)  ans[j] = curr.get(j);
                return ans; 
            }
        }
        return new String[0];
    }
}