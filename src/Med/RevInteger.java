class RevInteger {
    class Solution {
    public int reverse(int x) {
        
        boolean isNegative = false;
        
        if(x < 0) {
            isNegative = true;
        }
        
        x = Math.abs(x);
        int rev = 0;
        
        while (x > 0) {            
            if (rev > Integer.MAX_VALUE/10) {
                return 0;
            }
            rev = (rev * 10) + x % 10;
            x = x/10;
        }
        return isNegative ? (-1 * rev) : rev;
    }
}
}