class MedianFinder {

    
    PriorityQueue<Integer> small;
    PriorityQueue<Integer> large;
    boolean isEven = true;
    public MedianFinder() {
        small = new PriorityQueue(Collections.reverseOrder());
        large = new PriorityQueue();
    }
    
    public void addNum(int num) {
        if (isEven) {
            large.add(num);
            small.add(large.poll());
        } else {
            small.add(num);
            large.add(small.poll());
        }
        isEven = !isEven;
    }
    
    public double findMedian() {
        if (isEven) {
            return (small.peek() + large.peek()) / 2.0;
        } else {
            return small.peek();
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */