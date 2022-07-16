class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        
        boolean fp = false;
        boolean fd = false;
        int prev = arr[0];
        for (int i=1; i<arr.length; i++) {
            
            if (arr[i] > prev) {
                if (fp) {
                    return false;
                }
                fd = true;
                prev = arr[i];
                continue;
            }
            
            if (arr[i] < prev) {
                fp = true;
                prev = arr[i];
                continue;
            }
            
            return false;
        }
        
        return fp && fd;
        
    }
}