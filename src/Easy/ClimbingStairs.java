package Easy;

import java.util.HashMap;

public class ClimbingStairs  {

    /**
     *  basic top down approach.
     *  base condition is i == n return 1;
     *  without memoization lots of cases will be repeated across recursions.
     *  time complexity o(2^n) https://stackoverflow.com/a/13467808/12415069
     *
     */
    private class  Solution1 {
        public int climbStairs(int   n) {
            return helper(0,n);
        }

        private int helper(int i, int n) {
            if (i>n) {
                return 0;
            }

            if (i == n) {
                return 1;
            }

            return helper(i+1,n) + helper(i+2,n);
        }
    }

    /**
     *  basic top down approach.
     *  base condition is i == n return 1;
     *  with memoization
     *  space complexity is o(n)
     *  time complexity is also o(n)
     *
     */
    private class Solution2 {
        HashMap<Integer,Integer> memo = new HashMap<>();

        public int climbStairs(int n) {
            return helper(0,n);
        }

        private int helper(int i, int n) {
            if (i>n) {
                return 0;
            }

            if (i == n) {
                return 1;
            }
            if (memo.containsKey(i)) {
                return memo.get(i);
            }

            int sol = helper(i+1,n) + helper(i+2,n);
            memo.put(i,sol);
            return sol;
        }
    }

    /**
     *  basic bottom up approach.
     *  space complexity is o(n)
     *  time complexity is also o(n) as it is done in a single pass
     *
     */
    private class Solution3 {
        public int climbStairs(int n) {
            int[] dp = new int[n+1];
            if (n < 3) {
                return n;
            }

            dp[1] = 1;
            dp [2] = 2;

            for (int i=3;i<=n;i++) {
                dp[i] = dp[i-1] + dp[i-2];
            }
            return dp[n];
        }
    }

    /**
     *  basic bottom up approach.
     *  space complexity is o(1) as we only need last 2 values to calculate next value
     *  time complexity is also o(n) as it is done in a single pass
     *
     */
    private class Solution4 {
        public int climbStairs(int n) {
            int[] dp = new int[n+1];
            if (n < 3) {
                return n;
            }

            int sol = 0;
            int back1 = 2;
            int back2 = 1;

            for (int i=3;i<=n;i++) {
                sol = back2 + back1;
                back2 = back1;
                back1 = sol;
            }
            return sol;
        }
    }

}
