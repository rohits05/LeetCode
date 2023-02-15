class Solution {
    public int findNthDigit(int n) {
        long multOfNine = 9, numberOfDigits = 1, base = 1, 
        currentDigitLimit = multOfNine * numberOfDigits;
        
        while(n > currentDigitLimit){
                n -= currentDigitLimit;
                base = base * 10L;
            
                multOfNine *= 10L;
                numberOfDigits +=1;
                currentDigitLimit = multOfNine * numberOfDigits;
        }
              
        long number = base + (n  - 1)  / numberOfDigits,
        positionInWord =  (n  - 1)  % numberOfDigits;
        
        for(int i=0; i<numberOfDigits - positionInWord -1; i++) number /= 10L;
        return (int)number % 10; 
    }
}