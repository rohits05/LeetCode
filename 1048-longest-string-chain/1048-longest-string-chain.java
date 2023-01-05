class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words, new Comparator<String>(){
            public int compare(String a, String b){
                return a.length()-b.length();
            }
        });
        
        int[] dp=new int[words.length];
        int res=0;
        for(int i=0;i<words.length;i++){
            dp[i]=1;
            for(int j=i-1;j>=0;j--){
                if(words[j].length()<words[i].length()-1) 
                    break;
                if(words[j].length()==words[i].length()||!check(words[i], words[j])) 
                    continue;
                dp[i]=Math.max(dp[i], dp[j]+1);  
            }
            res=Math.max(res, dp[i]);
        }
        return res;
    }
    
    public boolean check(String a, String b) {
        for(int i=0, j=0;i<a.length()&&j<b.length();i++, j++){
            if(a.charAt(i)!=b.charAt(j)&&i==j) 
                j--;
            else if(a.charAt(i)!=b.charAt(j)) 
                return false;
        }
        return true;
    }
}