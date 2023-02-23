class Solution {
    public int countPairs(int[] deliciousness) {
        int MOD = 1000000007, res = 0;
        Map<Integer, Integer> mp = new HashMap();

        for(int num: deliciousness) {
            for(int i=0; i<=22; i++) {
                int k = (int)Math.pow(2, i);
                if(mp.containsKey(k - num)) {
                    res += mp.get(k - num);
                    res %= MOD;
                }
            }
            
            mp.put(num, mp.getOrDefault(num, 0)+1);
        }

        return res;
    }
}