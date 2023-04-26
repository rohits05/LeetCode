class Solution {
    public int minimumSum(int num) {
        int bckt[] = new int[10];
        while(num > 0){
            bckt[num % 10]++;
            num /= 10;
        }

        int newBkt[] = new int[2];
        int j =0;
        
        for(int i=0; i<10; i++){
            while(bckt[i] > 0){
                newBkt[j] *= 10; newBkt[j] += i;
                j = (j + 1) % 2;
                bckt[i]--;
            }
        }

        return (newBkt[0] + newBkt[1]);
    }
}