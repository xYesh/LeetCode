class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        
        int sol = 0;
        
        for (int i=0; i<manager.length;i++) {
            sol = Math.max(sol,dfs(i,manager,informTime));
        }
        
        return sol;
    }
    
    private int dfs(int i, int[] m, int[] inf) {
        
        if (m[i] != -1) {
            inf[i] = inf[i] + dfs(m[i],m,inf);
        }
        m[i] = -1;
        return inf[i];
        
    }
}