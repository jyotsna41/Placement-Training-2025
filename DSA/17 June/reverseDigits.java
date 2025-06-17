class Solution {
    public int reverseDigits(int n) {
        boolean isNegative = n < 0;
        
        n = Math.abs(n);
        int reversed = 0;
        
        while (n>0) {
            int digit = n % 10 ;
            reversed = reversed * 10 + digit ;
            n /= 10;
            
        }
        if (isNegative) {
            reversed = -reversed;
        }
        return reversed;
    }
}
