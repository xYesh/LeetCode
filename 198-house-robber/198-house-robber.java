class Solution {
    
    HashMap<Integer,Integer> memo = new HashMap();
    
    public int rob(int[] nums) {
        memo = new HashMap();
        return dp(nums,0);
    }
    
    private int dp(int[] nums, int idx) {
        
        if (idx >= nums.length) {
            return 0;
        }
        
        if (memo.containsKey(idx)) {
            return memo.get(idx);
        }
        
        int sol = Math.max(nums[idx] + dp(nums,idx + 2), dp(nums,idx+1));
        memo.put(idx,sol);
        return sol;
    }
}