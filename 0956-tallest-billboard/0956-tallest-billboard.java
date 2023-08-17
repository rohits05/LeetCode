class Solution {
    public int tallestBillboard(int[] rods) {
        Map<Integer, Integer> dp = new HashMap<>();
        dp.put(0, 0);

        for(int h: rods){
            Map<Integer, Integer> curr = new HashMap<>(dp);
            for (int diff : curr.keySet()) {
                int height = curr.get(diff);

                dp.put(diff, Math.max(dp.getOrDefault(diff, 0), height));
                dp.put(diff+h, Math.max(dp.getOrDefault(diff+h, 0), height));
                dp.put(Math.abs(diff-h), Math.max(dp.getOrDefault(Math.abs(diff-h), 0), 
                       height + Math.min(diff, h)));
            }
        }

        return dp.getOrDefault(0, 0);
    }
}