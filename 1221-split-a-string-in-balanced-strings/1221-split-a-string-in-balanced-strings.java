class Solution {
    public int balancedStringSplit(String s) {
        int result = 0, sum = 0;
        
        for(char letter: s.toCharArray()){
            sum += (letter == 'R' ? 1 : -1);
            if(sum == 0) result++;
        }
        return result;
    }
}