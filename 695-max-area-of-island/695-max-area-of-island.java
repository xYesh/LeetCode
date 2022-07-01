class Solution {
    
    int sol = 0;
    
    public int maxAreaOfIsland(int[][] grid) {
        
        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    sol = Math.max(sol,helper(i,j,grid));
                }
            }
        }
        
        return sol;
    }
    
    private int helper(int i, int j, int[][] grid) {
        
        if (grid[i][j] == 1) {
            grid[i][j] = 0;
        } else {
            return 0;
        }
        
        int isol = 1;
        if (i>0) {
            isol = isol + helper(i-1,j,grid);
        }
        if (i<grid.length-1) {
            isol = isol + helper(i+1,j,grid);
        }
        
        if (j>0) {
            isol = isol + helper(i,j-1,grid);
        }
        if (j<grid[0].length-1) {
            isol = isol + helper(i,j+1,grid);
        }
        
        return isol;
        
    }
    
}