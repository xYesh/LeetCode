class Solution {
    
    private HashMap<Integer,Integer> map;
    
    public int minCostClimbingStairs(int[] cost) {
        map = new HashMap();
        return helper(cost,0);
        
    }
    
    private int helper(int[] cost, int step) {
        
        if (step >= cost.length - 1) {
            return 0;
        }
        
        if (map.containsKey(step)) {
            return map.get(step);
        }
        
        int oneStep = cost[step] + helper(cost, step+1);
        int twoStep = cost[step+1] + helper(cost, step+2);
        
        int sol =  Math.min(oneStep,twoStep);
        
        map.put(step,sol);
        
        return sol;
    }
}