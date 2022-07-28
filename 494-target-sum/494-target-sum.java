class Solution {
    int sol = 0;
    public int findTargetSumWays(int[] nums, int target) {
        sol=0;
        helper(nums,target,0,0);
        return sol;
    }
    
    private void helper(int[] nums, int target, int sum, int i) {
        
        if (i == nums.length && target == sum) {
            sol++;
        }
        
        if (i < nums.length) {
            
            helper(nums,target, sum + nums[i] , i+1);
            
            helper(nums,target, sum - nums[i] , i+1);
        }
        
    }
}