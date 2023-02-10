class Solution {
    public int maxNumberOfBalloons(String text) {
        int mem[] = calcMem(text);
        int str_mem[] = calcMem("balloon");
        
        return maxInstance(mem, str_mem);
    }
    
    private int[] calcMem(String str){
        int mem[] = new int[26];
        for(char ch: str.toCharArray()) mem[ch-'a']++;
        
        return mem;
    }
    
    private int maxInstance(int mem[], int str_mem[]){
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<26; i++){
            if(str_mem[i]>0) ans = Math.min(ans, mem[i]/str_mem[i]);
        }
        
        return ans;
    }
}