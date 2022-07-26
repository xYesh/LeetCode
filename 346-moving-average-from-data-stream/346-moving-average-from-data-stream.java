class MovingAverage {

    
    int count = 0;
    int size = 0;
    int[] arr;
    public MovingAverage(int size) {
        arr = new int[size];
        this.size = size;
        count = 0;
    }
    
    public double next(int val) {
        int pos = count % size;
        arr[pos] = val;        
        count++;
        double sum = 0;
        int limit = count < size ? count : size;
        for (int i=0; i<limit; i++) {
            sum = sum + arr[i];
        }
               
        return (double) sum/limit;
        
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */