class Solution {
    public int firstMissingPositive(int[] nums) {
        
        boolean hasone = false;
        for (int n : nums) {
            if (n == 1) {
                hasone = true;
            }
        }
        
        if (!hasone) {
            return 1;
        }
        
        for (int i=0; i<nums.length; i++) {
            if (nums[i] > nums.length || nums [i] < 1) {
                nums[i] = 1;
            }
        }
        
        System.out.println(Arrays.toString(nums));
        
        for (int i=0; i<nums.length; i++) {
            int a = Math.abs(nums[i]);
            if (a == nums.length) {
                nums[0] = -a;
            } else {
                nums[a] = -Math.abs(nums[a]);
            }
        }
        
        System.out.println(Arrays.toString(nums));
        
        int sol = 1;
        for (int i=1; i<nums.length; i++) {
           if (nums[i] > 0) {
               return i;
           }
        }
        
        if (nums[0] >= 0) {
            return nums.length;
        }
        
        return nums.length + 1;
        
    }
}