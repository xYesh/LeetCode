class Solution {
    int[] nums;
    public int findKthLargest(int[] nums, int k) {
        this.nums = nums;
        
        return quickSelect(0,nums.length-1,nums.length-k);       
    }
    
    private int quickSelect(int left, int right, int k) {
        if (left == right) {
            return nums[left];
        }
        
        Random random_num = new Random();
        int pivot_index = left + random_num.nextInt(right - left); 

        pivot_index = partition(left, right, pivot_index);        
        
        if (pivot_index == k) {
            return nums[k];
        }
        if (pivot_index < k) {
            return  quickSelect(pivot_index + 1,right,k);
        } else {
            return quickSelect(left,pivot_index - 1,k);
        }
    }
    
    private void swap(int left,int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
    
    private int partition(int left, int right, int pivot_index) {
        int pivot = nums[pivot_index];
        swap(right,pivot_index);
        
        int counter = left;
        for (int i=left;i<right;i++) {
            if (nums[i] < pivot) {
                swap(i,counter);
                counter++;
            }
        }
        
        swap(counter,right);
        
        return counter;
        
    }
    
    
}