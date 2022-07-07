class Solution {
    
    
    public int lengthOfLongestSubstring(String s) {
        
        if (s.length() == 1) {
            return 1;
        }
        
        int start = 0;
        int max = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        
        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                max = Math.max(max, i - start);
                start = Math.max(start,map.get(ch) + 1);
            } else {
                max = Math.max(max, i - start);
            }
            map.put(ch,i);
            max = Math.max(max, i + 1 - start);
        }        
        return max;
    }
}