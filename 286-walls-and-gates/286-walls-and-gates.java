class Solution {
    
    private static final List<int[]> DIRECTIONS = Arrays.asList(
        new int[] { 1,  0},
        new int[] {-1,  0},
        new int[] { 0,  1},
        new int[] { 0, -1}
    );
    
    public void wallsAndGates(int[][] rooms) {
        
        LinkedList<int[]> q = new LinkedList<>();
        
        for (int i=0; i<rooms.length; i++) {
            for (int j=0; j<rooms[0].length;j++) {
                if (rooms[i][j] == 0) {
                    q.add(new int[] {i,j});
                }
            }
        }
        
        while (!q.isEmpty()) {
            
            int[] curr = q.poll();
            
            int row = curr[0];
            int col = curr[1];
            
            for (int[] direction : DIRECTIONS) {
                int r = row + direction[0];
                int c = col + direction[1];
                
                if (r < 0 || r >= rooms.length || c < 0 || c >= rooms[0].length || rooms[r][c] != Integer.MAX_VALUE) {
                    continue;
                }
                
                rooms[r][c] = rooms[row][col] + 1;
                
                q.add(new int[] {r,c});
                
            }
            
        }
        
    }
}