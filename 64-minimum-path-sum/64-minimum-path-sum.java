// class Solution {
    
//     int sol = Integer.MAX_VALUE;
    
//     public int minPathSum(int[][] grid) {
//         sol = Integer.MAX_VALUE;
//         dfs(grid, 0,0,0);
//         return sol;
//     }
    
//     private void dfs(int[][] grid, int row, int col, int curr) {
//         curr = curr + grid[row][col];

//         if (row >= grid.length - 1 && col >= grid[0].length - 1) {
//             sol = Math.min(sol,curr);
//         }
        
//         if (row != grid.length -1) {
//             dfs(grid,row+1,col,curr);
//         }
        
//         if (col != grid[0].length-1) {
//             dfs(grid,row,col+1,curr);
//         }
//     }
// }

public class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        for (int i = grid.length - 1; i >= 0; i--) {
            for (int j = grid[0].length - 1; j >= 0; j--) {
                if(i == grid.length - 1 && j != grid[0].length - 1)
                    dp[i][j] = grid[i][j] +  dp[i][j + 1];
                else if(j == grid[0].length - 1 && i != grid.length - 1)
                    dp[i][j] = grid[i][j] + dp[i + 1][j];
                else if(j != grid[0].length - 1 && i != grid.length - 1)
                    dp[i][j] = grid[i][j] + Math.min(dp[i + 1][j], dp[i][j + 1]);
                else
                    dp[i][j] = grid[i][j];
            }
        }
        return dp[0][0];
    }
}