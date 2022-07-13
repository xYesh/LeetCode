class Solution {
    
    public int findDuplicate(int[] nums) {
        
        int tortis = nums[0];
        int hare = nums[0];
        
        do {
            
            tortis = nums[tortis];
            hare = nums[nums[hare]];
        } while (tortis != hare);   
        
        tortis = nums[0];
        
        while (tortis != hare) {
            tortis = nums[tortis];
            hare = nums[hare];
        }
        
        return hare;
        
        
    }
}