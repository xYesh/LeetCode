class Solution {
    public int[] sumZero(int n) {
        int[] sol = new int[n];
        int count = 0;
        if (n%2 != 0) {
            sol[0] = 0;
            count++;
        }
        
        
        for (int i=1; i<=n/2; i++) {
            sol[count++] = i;
            sol[count++] = -i;
        }
        
        return sol;
        
        
    }
}