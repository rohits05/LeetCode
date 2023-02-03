class Solution {
    public String convert(String s, int numRows) {
        if(numRows < 2) return s;
        ArrayList<StringBuilder> list = new ArrayList<>();
        for(int i=0; i<numRows; i++) list.add(new StringBuilder());

        int i = 0, reverse = -1;
        for(char c: s.toCharArray()){
          list.get(i).append(c);
          if(i == 0 || i == numRows - 1) reverse = -reverse;
          i += reverse;
        }

        StringBuilder Builder = new StringBuilder();
        for(StringBuilder s1: list) Builder.append(s1);
        return Builder.toString();
    }
}