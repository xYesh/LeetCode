class MyCircularQueue {
    
    int maxSize = 0;
    int currSize = 0;
    ArrayList<Integer> list;
    public MyCircularQueue(int k) {
        list = new ArrayList();
        maxSize = k;
    }
    
    public boolean enQueue(int value) {
        if (currSize < maxSize) {
            list.add(value);
            currSize++;
            return true;
        }
        return false;
    }
    
    public boolean deQueue() {
        if (currSize == 0) {
            return false;
        }
        currSize--;
        list.remove(0);
        return true;
    }
    
    public int Front() {
        if (currSize == 0) {
            return -1;
        }
        return list.get(0);
    }
    
    public int Rear() {
        if (currSize == 0) {
            return -1;
        }
        return list.get(currSize-1);
    }
    
    public boolean isEmpty() {
        return list.isEmpty();
    }
    
    public boolean isFull() {
        return currSize == maxSize;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */