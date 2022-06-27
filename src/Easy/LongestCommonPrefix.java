package Easy;

public class LongestCommonPrefix {

    /**
     *  Vertical scan approach.
     *  scan that particular char in all strings and compare;
     *  space complexity is o(1) no additional space is used.
     *  time complexity is o(s) = sum of size of all strings
     *
     */
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            int pointer = 0;
            char ch = ' ';

            for (int j = 0; j < strs[0].length();j++) {
                for (int i=0; i<strs.length;i++) {
                    if (i == 0) {
                        ch = strs[0].charAt(pointer);
                        continue;
                    }

                    if (strs[i].length() == pointer || strs[i].charAt(pointer) != ch) {
                        return strs[0].substring(0,pointer);
                    }
                }
                pointer++;
            }
            return strs[0];
        }
    }

    /**
     * Binary search solution;
     *
     * time complexity is o(n log(n)); is actually worse than vertical scan.
     * space complexity is o(1) as no extra space is used.
     */
    class Solution1 {

        String[] strs;
        public String longestCommonPrefix(String[] strs) {
            this.strs = strs;
            int left = 1;
            int right = Integer.MAX_VALUE;
            for (String str : strs)
                right = Math.min(right, str.length());

            while (left <= right) {
                int mid = (left+right)/2;

                if (isSubString(mid)) {
                    left = mid + 1;
                } else {
                    right = mid-1;
                }
            }
            return strs[0].substring(0, (left + right) / 2);
        }

        private boolean isSubString(int mid) {
            String prefix = strs[0].substring(0,mid);
            for (int i=1; i<strs.length;i++) {
                if(!strs[i].startsWith(prefix)) {
                    return false;
                }
            }
            return true;
        }
    }
}
