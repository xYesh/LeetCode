class Solution {
    
    HashMap<Integer,Integer> map = new HashMap();
    
    public int coinChange(int[] coins, int amount) {
         map = new HashMap();
        return helper(coins,amount);
    }
    
    private int helper(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        } if (amount < 0) {
            return Integer.MAX_VALUE;
        }
        
        if (map.containsKey(amount)) {
            return map.get(amount);
        }
        
        int min = Integer.MAX_VALUE;
        for (int coin : coins) {
            int temp = helper(coins,amount-coin) + 1;
            if (temp > 0) {
                min = Math.min(min,temp);
            }
        }
        
        min = min == Integer.MAX_VALUE ? -1 : min;
        
        map.put(amount,min);
        
        return min;
    }
}