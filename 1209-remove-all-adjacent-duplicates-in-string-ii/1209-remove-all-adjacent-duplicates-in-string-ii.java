class Solution {
    public String removeDuplicates(String s, int k) {
        
        StringBuilder sb = new StringBuilder(s);
        
        int[] co = new int[sb.length()];
        
        for (int i=0; i<sb.length(); i++) {
            
            if (i == 0 || sb.charAt(i) != sb.charAt(i-1)) {
                co[i] = 1;
            } else {
                co[i] = co[i-1] + 1;
                if (co[i] == k) {
                    sb.delete(i-k + 1,i + 1);
                    i = i -k;
                }
            }
            
        }
        
        return sb.toString();
        
    }
}