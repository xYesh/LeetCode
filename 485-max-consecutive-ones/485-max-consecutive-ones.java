class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sol = -1;
        int count = 0;
        for (int num : nums) {
            if (num == 1) {
                count ++;
            } else {
                count = 0;
            }
            sol = Math.max(count,sol);
        }
        
        return sol;
    }
}