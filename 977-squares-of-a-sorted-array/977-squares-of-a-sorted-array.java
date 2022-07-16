class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int left = 0;
        int right = nums.length -1;
        int counter = nums.length - 1;
        int[] sol = new int[nums.length];
        while (left <= right) {
            int larger = 0;
            if ( Math.abs(nums[left]) > Math.abs(nums[right])) {
                larger = nums[left];
                left ++;
            } else {
                larger = nums[right];
                right--;
            }
            // System.out.println(larger);
            sol[counter] = larger * larger;
            counter --;
        }
        return sol;
    }
}