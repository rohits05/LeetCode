class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        
        for(int i=0; i<spells.length; i++){
            int l =0, r =potions.length;
            
            while(l < r){
                int mid = l+(r-l)/2;
                if((long)spells[i]*potions[mid] >= success) r = mid;
                else l = mid+1;
            }
            spells[i] = potions.length-l; 
        }
        
        return spells;
    }
}