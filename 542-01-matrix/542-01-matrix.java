class Solution {
    
    
    
    public int[][] updateMatrix(int[][] mat) {
        LinkedList<Integer[]> q = new LinkedList<>();
        int row = mat.length;
        int col = mat[0].length;
        
        for (int i=0; i<row; i++) {
            for (int j=0; j<col;j++) {
                if (mat[i][j] == 0) {
                    q.add(new Integer[]{i,j});
                } else {
                    mat[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        
        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        
        while(!q.isEmpty()) {
            
            Integer[] curr = q.pop();
            
            for (int[] dir : dirs) {
                
                int r = curr[0] + dir[0];
                int c = curr[1] + dir[1];
                
                if (r < 0 || r >= row || c < 0 || c >= col || mat[r][c] <= mat[curr[0]][curr[1]]) {
                    continue;
                }
                
                // System.out.println(" setting to = " + (mat[curr[0]][curr[1]] + 1));
                mat[r][c] = mat[curr[0]][curr[1]] + 1;
                
                q.add(new Integer[] {r,c});
                
            }
            
        }
        
        return mat;
        
    }
}