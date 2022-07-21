class Solution {
    public int connectSticks(int[] sticks) {
        
        int cost = 0;
        
        PriorityQueue<Integer> q = new PriorityQueue<>();
        
        for (int stick: sticks) {
            q.add(stick);
        }
        
        while (q.size() > 1){
            
            int stick1 = q.poll();
            int stick2 = q.poll();
            
            int sol = stick1+stick2;
            cost = cost + sol;
            q.add(sol);
            
        }        
        
        return cost;
    }
}