class Solution {
        
    public int lengthOfLongestSubstring(String s) {
        int sol = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        
        int start = 0;
        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                start = Math.max(map.get(ch),start);
            }
            
            sol = Math.max(sol,i-start+1);
            map.put(ch,i+1);
            System.out.println(sol + " " + start + " " + i);
        }
        
        return sol;
        
    }
}