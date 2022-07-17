class Solution {
    public void moveZeroes(int[] nums) {
        int zrs = 0;
        int count = 0;
        for (int i=0; i<nums.length; i++) {
            if(nums[i] == 0) {
                zrs++;
            } else {
                nums[count++] = nums[i];
            }
        }
        
        for (int i=nums.length - zrs; i < nums.length; i++) {
            nums[i] = 0;
        }
        
    }
}