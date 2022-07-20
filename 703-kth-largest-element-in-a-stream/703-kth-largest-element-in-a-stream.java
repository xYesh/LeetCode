class KthLargest {

    private PriorityQueue<Integer> q;
    
    int k;
    
    public KthLargest(int k, int[] nums) {
        this.q = new PriorityQueue();
        this.k = k;
        
        for (int num: nums) {
            q.add(num);  
            if (q.size() > k) {
                q.poll();
            }
        }
    }
    
    public int add(int val) {
        q.add(val);
        
        if (q.size() > k) {
            q.poll();
        }
        
        return q.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */