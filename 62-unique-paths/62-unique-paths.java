// class Solution {
//     public int uniquePaths(int m, int n) {
//         return helper(0,0,m,n);
//     }
    
//     private int helper(int i, int j, int m, int n) {
//         if (i == m -1 || j == n-1) {
//             return 1;
//         }
        
//         return helper(i+1,j,m,n) + helper(i,j+1,m,n);
//     }
// }

class Solution {
  public int uniquePaths(int m, int n) {
    int[][] d = new int[m][n];

    for(int[] arr : d) {
      Arrays.fill(arr, 1);
    }
    for(int col = 1; col < m; ++col) {
      for(int row = 1; row < n; ++row) {
        d[col][row] = d[col - 1][row] + d[col][row - 1];
      }
    }
    return d[m - 1][n - 1];
  }
}