class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int left = 0;
        int right = 0;
        boolean converted = false;
        int sol = 0;
        
        //keep a pointer to the last zero so we don't need to iterate again
        int lastzero = 0;
        
        while (right < nums.length) {
            if (nums[right] == 1) {
                sol = Math.max(sol, right - left + 1);
            } else {
                if (converted) {
                    left = lastzero + 1;
                    lastzero = right;
                    right ++;
                    continue;
                }
                
                lastzero = right;
                converted = true;
                sol = Math.max(sol, right - left + 1);
            }
            right ++;
        }
        
        return sol;
    }
}