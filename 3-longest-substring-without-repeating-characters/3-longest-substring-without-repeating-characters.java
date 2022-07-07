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
            map.put(ch,map.getOrDefault(ch,0) + 1);
            
            if (map.get(ch) > 1) {
                
                while (map.get(ch) > 1) {
                    char temp = s.charAt(start);
                    map.put(temp,map.getOrDefault(temp,1)-1);
                    // System.out.println("here " + temp + " " + map);
                    start++;
                }
            } else {
                max = Math.max(max, i - start);
            }
            
            max = Math.max(max, i + 1 - start);
            // System.out.println(start + " " + map + " " + max + " ");
        }
        
        // System.out.println(start);
        
        return max;
    }
}