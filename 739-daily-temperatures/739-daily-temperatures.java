class Solution {
    public int[] dailyTemperatures(int[] temps) {
        
        Stack<Integer> stack = new Stack<>();
        int[] sol = new int[temps.length];
        
        for (int i=0; i<temps.length; i++) {
            int currTemp = temps[i];
            
            while (!stack.isEmpty() && currTemp > temps[stack.peek()]) {
                int day = stack.pop();
                sol[day] = i - day; 
            }
            
            stack.add(i);
        }
        
        return sol;
    }
}