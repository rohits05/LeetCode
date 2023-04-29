class Solution {
    public int trap(int[] height) {
        if(height == null || height.length == 0) return 0;
        
        int n =height.length - 1;
        int level =0, water =0, index =0;
        
        while(n > 0){
            int lower = height[index] < height[index + n] 
                ? height[index++] : height[index + n];
            
			if(lower > level) level = lower;
			water += level - lower; n--;
        }
        return water;
    }
}