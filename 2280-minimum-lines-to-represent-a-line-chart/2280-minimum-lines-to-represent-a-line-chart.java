class Solution {
    static int gcd(int a, int b)   {   
        if(b == 0) return a;  
        if(a == 0) return b;
        return gcd(b, a%b);   
    }   
    
    public int minimumLines(int[][] stock) {
        if(stock.length <= 1) return 0;
        Arrays.sort(stock, (a,b) -> a[0]-b[0]);
        int line =1;
        int y = stock[1][1]-stock[0][1], x = stock[1][0]-stock[0][0];
        int g = gcd(x, y);
        y /= g;
        x /= g;
        String slope = y+","+x;
        
        for(int i=2; i<stock.length; i++){
             y = stock[i][1]-stock[i-1][1];
             x = stock[i][0]-stock[i-1][0];
             g = gcd(x, y);
             y /= g;
             x /= g;
            String currentSlope = y+","+x;
            if(!slope.equals(currentSlope)){
                slope = currentSlope;
                line++;
            } 
        }
        
        return line;
    }
}