class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int left = 0;
        int right = 0;
        int ans = 0;
        boolean flipped = false;
        int lastZero = 0;
        while (right < nums.length) {
            
            if (nums[right] == 0) {   
                 if (flipped) {
                    left = lastZero;
                    lastZero = right + 1;
                 } else {
                    flipped = true;
                    lastZero = right + 1;
                 }
            }
            ans = Math.max(ans, right - left + 1);  
            right ++;
        }
        return ans;

    }
    
}