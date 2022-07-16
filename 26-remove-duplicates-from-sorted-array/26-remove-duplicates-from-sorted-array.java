class Solution {
    public int removeDuplicates(int[] nums) {
        
        int left = 0;
        int right = 0;
        int currNo = nums[0];
        
        while (right < nums.length) {
            
            if (right == nums.length-1 || nums[right] != nums[right+1]) {
                nums[left++] = nums[right];
            }
            
            right ++;            
        }
        
        return left;
    }
}