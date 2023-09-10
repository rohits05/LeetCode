class Solution {
    public boolean isSameAfterReversals(int num) {
        return (reV(reV(num)) == num);
        // return (num == 0 || num%10 != 0);
    }

    private int reV(int num) {
        int temp = num, ans = 0;
        
        while(temp != 0){
            int md = temp%10, ad = ans*10;
            int rem = md;
            ans = ad + rem;
            temp/=10;
        }

        return ans;
    }
}