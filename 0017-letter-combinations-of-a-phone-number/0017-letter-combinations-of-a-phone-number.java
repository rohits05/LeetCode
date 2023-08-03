class Solution {
    private static final String[] KEYS = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    
    public List<String> letterCombinations(String digits) {
        if(digits.equals("")) return new ArrayList<String>();

        List<String> ret = new LinkedList<String>();
        combination("", digits, 0, ret);
        return ret;
    }

    private void combination(String prefix, String digits, int offset, List<String> ret) {
        int n = digits.length();
        if(offset >= n){
            ret.add(prefix);
            return;
        }
        
        String letters = KEYS[(digits.charAt(offset) - '0')];
        int len = letters.length();
        for(int i=0; i<len; i++)
            combination(prefix + letters.charAt(i), digits, offset+1, ret);
    }
}