class Solution {
    public int maximumDifference(int[] nums) {
        int min = nums[0];
        int sol = -1;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] > min) {
                sol = Math.max(sol, nums[i] - min);
            } else {
                if (nums[i] < min) {
                    min = nums[i];
                }
            }
        }

        return sol;
    }
}