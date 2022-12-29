class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        
        for(int i=0; i<asteroids.length; i++){
            int astMass = asteroids[i];
            
            if(astMass > mass) return false;
            mass += astMass;
            if(mass < 0) return true;    
        }
        return true;
    }
}