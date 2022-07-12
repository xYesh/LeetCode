class Solution {
    boolean found = false;
    String word = "";
    public boolean exist(char[][] board, String word) {
        this.word = word;
        for (int i=0; i<board.length;i++) {
            for (int j=0; j<board[0].length;j++) {
                if (board[i][j] == word.charAt(0)) {
                    helper (i,j,0,board);
                }
            }
        }
        return found;
    }
    
    private boolean helper(int i, int j, int idx,char[][] board) {
        
        if (idx >= word.length()) {
            found = true;
            return true;
        }
        
        if (i < 0 || i == board.length || j < 0 || j == board[0].length) {
            return false;
        }
        
        if (board[i][j] != word.charAt(idx) || board[i][j] == '1') {
            return false;
        }
        

        
        char ch = board[i][j];
        // System.out.println(ch);
        
        board[i][j] = '1';
        
        boolean found = helper(i-1,j,idx+1,board) || helper(i+1,j,idx+1,board) || helper(i,j-1,idx+1,board) 
            || helper(i,j+1,idx+1,board);
        
        board[i][j] = ch;
        
        return found;
    }
}