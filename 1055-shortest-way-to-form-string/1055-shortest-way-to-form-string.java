class Solution {
    public int shortestWay(String source, String target) {
        
        int count = 0;
        
        Set<Character> set = new HashSet<>();
        for (char ch : source.toCharArray()) {
            set.add(ch);
        }
        
        
        for (int i=0; i<target.length();) {
            char tch = target.charAt(i);
            for (int j = 0 ; j < source.length() && i <target.length(); j++) {
                tch = target.charAt(i);
                char sch = source.charAt(j);
                // System.out.println(tch + " " + sch);
                if (tch == sch) {
                    i++;
                }                
            }
            
            if (!set.contains(tch)) {
                return -1;
            }
            
            count ++;           
        }
        
        return count;
    }
}