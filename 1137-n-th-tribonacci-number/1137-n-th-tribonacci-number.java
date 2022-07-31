class Solution {
    
    HashMap<Integer,Integer> map = new HashMap<>();
    
    public int tribonacci(int n) {
        
        if (n == 0) {
            return 0;
        } else if (n <= 2) {
            return 1;
        }
        
        if(map.containsKey(n)) {
            return map.get(n);
        }
        
        int sol = tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3);
        map.put(n,sol);
        return sol;
        
    }
}