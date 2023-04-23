class Solution {
    public int numberOfArrays(String s, int k) {
        long[] memo = new long[s.length()];
        Arrays.fill(memo, -1L);
        return (int)(solve(s, k, 0, memo) % 1000000007);
    }

    public long solve(String input, int k, int index, long[] memo) {
        if(index == input.length()) return 1;
        
        if(memo[index] != -1) return memo[index];
        
        long result = 0;
        for(int i=index; i<input.length(); i++){
            String number = input.substring(index, i+1);
            if(isValid(number, k)) result = result + solve(input, k, i+1, memo);
            else break;
        }
        return memo[index] = result % 1000000007;
    }

    boolean isValid(String number, int k) {
        return number.charAt(0) != '0' && Long.parseLong(number) <= k;
    }
}