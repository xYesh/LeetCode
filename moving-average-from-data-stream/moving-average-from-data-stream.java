class MovingAverage {

    
    int count = 0;
    int size = 0;
    int sum = 0;
    int[] arr;
    public MovingAverage(int size) {
        arr = new int[size];
        this.size = size;
        count = 0;
    }
    
    public double next(int val) {
        int pos = count % size;
        count++;
        int limit = count < size ? count : size;
        
        
        if (count > size) {
            sum = sum - arr[pos] + val;
        } else {
            sum = sum + val;
        }
               
        arr[pos] = val;        

        return (double) sum/limit;
        
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */