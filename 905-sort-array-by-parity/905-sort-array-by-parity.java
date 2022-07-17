class Solution {
    int[] nums;
    public int[] sortArrayByParity(int[] nums) {
        this.nums = nums;
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            
            // System.out.println(left + " " + right);
            
            if (isEven(left)) {
                left ++;
                continue;
            }
            
            if (isEven(right)) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                right --;
                left ++;
            } else {
                right --;
            }
        }
        
        return nums;
    }
    
    private boolean isEven(int i) {
        if (nums[i] % 2 == 0) {
            return true;
        }
        return false;
    }
}