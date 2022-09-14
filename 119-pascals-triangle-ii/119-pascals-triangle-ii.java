class Solution {
    public List<Integer> getRow(int rowIndex) {
        Integer[] res = new Integer[rowIndex + 1];
        
        res[0] = 1;
        for(int i=1; i<=rowIndex; i++){
            res[i] = (int) (((long) res[i-1]*(rowIndex - i + 1))/ i);
        }
        return Arrays.asList(res);
    }
}