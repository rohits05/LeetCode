class Solution {
    public int minimizeXor(int a, int b) {
        int count = countSetBits(b);
        int x = 0;
        for(int i=31; i>=0; i--){
            if(count==0) break;
            if(((a&(1<<i)) != 0) && count>0){
                x = setBitAtPos(x, i);
                count--;
            }
        }
        if(count==0) return x;
        
        for(int i=0; i<31; i++){
            if(((a&(1<<i))==0) && count>0){
                x = setBitAtPos(x, i);
                count--;
            }
        }
        
        return x;  
    }
    
    private static int countSetBits(int x){
        int ans = 0;
        while(x>0){
            if(x%2 == 1) ans++;
            x = x/2;
        }
        
        return ans;
    }
    
    private static int setBitAtPos(int x, int pos){
        return x | (1<<pos);
    }
}