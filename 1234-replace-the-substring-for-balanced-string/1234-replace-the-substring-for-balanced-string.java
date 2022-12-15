class Solution {
    public int balancedString(String s) {
        int[] map = new int[128];
        for(int i=0; i<s.length(); i++){
            map[s.charAt(i)]++;
        }
        int baseline = s.length() / 4;
        int left = 0, right = 0, ans = s.length();
        
        while(left < s.length() && right < s.length()){
            map[s.charAt(right)]--;
            
            while(map['Q'] <= baseline && map['W'] <= baseline && map['E'] 
                  <= baseline && map['R'] <= baseline){
                ans = Math.min(ans, right - left + 1);
                map[s.charAt(left)]++;
                left++;
            }
            right++;
        }
        return ans;
    }
}