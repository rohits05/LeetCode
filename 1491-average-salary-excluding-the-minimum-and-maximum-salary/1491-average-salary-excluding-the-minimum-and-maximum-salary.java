class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double sum = 0, n = salary.length-2;
        
        for(int i=1 ; i<salary.length-1 ; i++) sum += salary[i];
        
        double avg = sum/n;
        return avg;
    }
}