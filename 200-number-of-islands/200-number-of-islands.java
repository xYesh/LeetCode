class Solution {

    private List<int[]> directions = Arrays.asList(
        new int[] {1,0},
        new int[] {-1,0},
        new int[] {0,1},
        new int[] {0,-1}
    );
    
    public int numIslands(char[][] grid) {
        
        LinkedList<int[]> q = new LinkedList<>();
        
        int sol = 0;
        
        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    sol++;
                    q.add(new int[]{i,j});
                    
                    while (!q.isEmpty()) {
                        int[] curr = q.poll();
                        int row = curr[0];
                        int col = curr[1];
                        
                        if (row < 0 || row >= grid.length || col < 0 || col >=grid[0].length || grid[row][col] != '1') {
                            continue;
                        }
                        
                        grid[row][col] = '0';
                        for (int[] direction : directions) {
                            int r = row + direction[0];
                            int c = col + direction[1];
                            q.add(new int[] {r,c});
                        }
                    }
                }
            }
        }
        return sol;
    }
}