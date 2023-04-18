class Solution {
    private boolean isValidSlope(double expectedSlope, double currentSlope) {
        double difference = Math.abs(currentSlope - expectedSlope);
        return (difference < 1E-7);
    }
    
    public boolean checkStraightLine(int[][] coordinates) {
        int x1 = coordinates[0][0], y1 = coordinates[0][1];

        // Horizontal line checks !!
        if(y1 == coordinates[1][1]){ 
            for(int i=2; i<coordinates.length; i++)
                if(coordinates[i][1] != y1) return false;
            return true;
        }

        double expectedSlope = getSlope(x1, y1, coordinates[1][0], coordinates[1][1]);

        for(int i=2; i<coordinates.length; i++){
            double slope = getSlope(x1, y1, coordinates[i][0], coordinates[i][1]);
            if(!isValidSlope(expectedSlope, slope)) return false;
        }

        return true;
    }

    private double getSlope(int x1, int y1, int x2, int y2) {
        return (x2 - x1) / (double)(y2 - y1);
    }
}