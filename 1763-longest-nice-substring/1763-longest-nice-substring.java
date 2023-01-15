class Solution {
    private char[] str;
    private static int LIM = 'z' + 33;
    public String longestNiceSubstring(String s) {
        str = s.toCharArray();
        int[] ans = find(0, s.length() - 1);
        return s.substring(ans[0], ans[1] + 1);
    }

    public int[] find(int start, int end) {
        if(end - start < 1) return new int[]{0, -1};
        boolean[] appearances = new boolean[LIM];
        for (int i=start; i<end+1; i++) appearances[str[i]] = true;


        for(int i=start; i<end+1; i++) {
            char c = str[i];
            if(!appearances[c + 32] && !appearances[c - 32]){
                int[] left = find(start, i - 1);
                int[] right = find(i + 1, end);

                if (left[1] - left[0] >= right[1] - right[0]) return left;
                return right;
            }
        }

        return new int[]{start, end};
    }
}