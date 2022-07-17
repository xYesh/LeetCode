class Solution {
    public int maxProfit(int[] prices) {
        
        int sol = 0;
        int min = prices[0];
        for (int i=1; i<prices.length; i++) {
            if (prices[i] > min) {
                sol = Math.max(sol, prices[i] - min);
            } else {
                min = prices[i];
            }
        }
        
        return sol;
        
    }
}