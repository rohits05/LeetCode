class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA=0, sumB =0, n =bobSizes.length;
        HashSet<Integer> hs = new HashSet<>();
        for(int alice: aliceSizes){
            sumA += alice;
            hs.add(alice);
        }
        
        for(int bob: bobSizes) sumB += bob;
        int diff = (sumA - sumB) / 2;
        for(int i =0; i<n; i++){
            int target = diff + bobSizes[i];
            if(hs.contains(target)) return new int[]{target, bobSizes[i]};
        }
        
        return null;
    }
}