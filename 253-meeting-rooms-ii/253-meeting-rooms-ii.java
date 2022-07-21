class Solution {
    public int minMeetingRooms(int[][] intervals) {
        
        PriorityQueue<Integer> q = new PriorityQueue<>();
        
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        
        q.add(intervals[0][1]);
        
        for (int i=1; i<intervals.length; i++) {
            
            int[] curr = intervals[i];
            
            if (curr[0] >= q.peek()) {
                q.poll();
            }
            q.add(curr[1]);
        }
        
        return q.size();
         
    }
}