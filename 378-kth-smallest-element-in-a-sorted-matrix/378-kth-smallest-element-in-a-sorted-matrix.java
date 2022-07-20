class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        
        PriorityQueue<Integer> q = new PriorityQueue(Collections.reverseOrder());
        for (int i=0; i< matrix.length; i++) {
            for (int j=0; j<matrix.length; j++) {
                q.add(matrix[i][j]);
                if (q.size() > k) {
                    q.poll();
                }
            }
        }
        
        return q.poll();
    }
}