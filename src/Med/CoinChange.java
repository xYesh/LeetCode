package Med;

import java.util.HashMap;

public class CoinChange {

    /**
     * Top down recursive approach with memoization.
     * Since we are not counting which types of coins .. simply adding 1 to result.
     */
    private class Solution {

        HashMap<Integer,Integer> memo;

        public int coinChange(int[] coins, int amount) {
            memo = new HashMap();
            return coinChangeHelper(coins,amount);
        }
        public int coinChangeHelper(int[] coins, int amount) {

            if (amount < 0) {
                return -1;
            }

            if (amount == 0) {
                return 0;
            }

            if (memo.containsKey(amount)) {
                return memo.get(amount);
            }

            int res = Integer.MAX_VALUE;
            for (int coin : coins) {
                int temp = coinChangeHelper(coins,amount - coin);
                if (temp >=0 && temp < res) {
                    res = 1 + Math.min(res, temp);
                }
            }
            res = res == Integer.MAX_VALUE ? -1 : res;
            memo.put(amount,res);
            return res;
        }
    }
}
