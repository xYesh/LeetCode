
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        return helper(text1, text2, 0, 0);
    }

    HashMap<String,Integer> memo = new HashMap<>();
    private int helper(String text1, String text2, int p1, int p2) {
        if (p1 == text1.length()  || p2 == text2.length() ) {
            return 0;
        }

        if(memo.containsKey(p1+" "+p2)){
            return memo.get(p1+" "+p2);
        }

        int answer = 0;
        if (text1.charAt(p1) == text2.charAt(p2)) {
            answer = 1 + helper(text1, text2, p1 + 1, p2 + 1);
        } else {
            answer = Math.max(helper(text1, text2, p1, p2 + 1), helper(text1, text2, p1 + 1, p2));
        }
        memo.put(p1+" "+p2,answer);

        return answer;
    }
}