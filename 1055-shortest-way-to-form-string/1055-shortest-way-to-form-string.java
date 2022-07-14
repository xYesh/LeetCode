class Solution {
    public int shortestWay(String source, String target) {
        
        int count = 0;
        
        for (char ch : target.toCharArray()) {
            if (!source.contains(ch+"")) {
                return -1;
            }            
        }
        
        for (int i=0; i<target.length();) {
                        
            for (int j = 0 ; j < source.length() && i <target.length(); j++) {
                char tch = target.charAt(i);
                char sch = source.charAt(j);
                // System.out.println(tch + " " + sch);
                if (tch == sch) {
                    i++;
                }                
            }
            
            count ++;           
        }
        
        return count;
    }
}