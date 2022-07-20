class Solution {
    public int lastStoneWeight(int[] nums) {
        
        PriorityQueue<Integer> q = new PriorityQueue(Collections.reverseOrder());
        
        for (int num: nums) {
            q.add(num);
        }
        
        while (q.size() > 1) {
            int first = q.poll();
            int sec = q.poll();
            
            if (first == sec) {
                continue;
            } else {
                q.add(first - sec);
            }
        }
        
        return q.peek() == null ? 0 : q.peek();
        
    }
}