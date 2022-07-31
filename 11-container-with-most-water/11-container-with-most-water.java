class Solution {
    public int maxArea(int[] height) {
        int i =0, j =height.length-1;
        int water =0;
        
        while(i<j){
            int wdth = j-i;
            int hght = Math.min(height[i], height[j]);
            water = Math.max(water, hght*wdth);
            
            if(height[i] < height[j]) i++;
            else j--;
        }
        return water;
    }
}