class Solution {
    public String reverseWords(String s){
        char[] carray = s.toCharArray();
        
        for (int i=0; i<carray.length; i++){ 
            if (carray[i] != ' '){ 
                int j = i;
                while (j+1 < carray.length && carray[j+1] != ' ')
                    j++; 
                
                reverse(carray, i, j);
                i = j;
            }
        }
        
        return new String(carray);
    }

    private void reverse(char[] cr, int i, int j) {
        for (; i<j; i++, j--) {
            char tmp = cr[i];
            cr[i] = cr[j];
            cr[j] = tmp;
        }
    }
}