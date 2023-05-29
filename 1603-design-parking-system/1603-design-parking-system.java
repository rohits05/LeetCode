class ParkingSystem {
    int[] system;
    public ParkingSystem(int big, int medium, int small) {
        system = new int[] {big, medium, small};
    }
    
    public boolean addCar(int carType) {
        if(system[carType - 1] > 0){
            system[carType - 1]--;
            return true;
        }
        
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */