class Solution {
    public String minRemoveToMakeValid(String s) {
        
        
        return recur(s);

        
    }
    
    private String recur(String s) {
        int open = 0;
        int close = 0;
        int lastLocation = 0;        
        for (int i=0; i<s.length();i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                open ++;
                lastLocation = i;
            } else if (ch == ')') {
                close ++;
                if (close > open) {
                    String n = s.substring(0,i) + s.substring(i+1,s.length());
                    return recur(n);
                }
            }
        }
        
        if (open != close) {
            String n = s.substring(0,lastLocation) + s.substring(lastLocation+1,s.length());
            return recur(n);
        }
        
        return s;
        
        
    }
}