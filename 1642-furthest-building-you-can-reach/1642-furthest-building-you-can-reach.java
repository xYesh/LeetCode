class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
     
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int i=0; i<heights.length - 1; i++) {
            
            int diff = heights[i+1] - heights[i];
            if (diff<=0) {
                continue;
            }
            
            q.add(diff);
            
            bricks = bricks - diff;
            
            if (bricks >= 0) {
                continue;
            }
            
            bricks = bricks + q.poll();
            
            if (ladders == 0) {
                return i;
            } else {
                ladders--;
            }
            
            // System.out.println(bricks + " " + ladders);
        }
        
        return heights.length-1;
        
        
    }
}