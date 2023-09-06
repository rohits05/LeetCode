class Solution {
    public int minimumSum(int n, int k) {
        Set<Integer> s = new HashSet<Integer>();
        int j =0, sum = 0;
        
        for(int i=1; j!=n; i++){
            if(!s.contains(k - i)){
                s.add(i);
                sum += i;
                j++;
            }
        }
        
        return sum;
    }
}