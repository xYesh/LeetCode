class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> nums = new Stack();
        
        for (String token : tokens) {
            
            if (!isOperator(token)) {
                nums.push(Integer.parseInt(token));
                continue;
            }
            
            int second = nums.pop(); 
            int first = nums.pop();
            int sum = 0;

            switch(token) {
                case "+" : 
                    sum = sum + first + second;break;
                case "-" :
                    sum = first - second; break;
                case "*" : 
                    sum = first * second; break;
                case "/":
                    sum = first/second;break;
            }
            
            nums.push(sum);
            
        }
        
        return nums.pop();
        
        
    }
    
    private boolean isOperator(String s) {
        
        if (s.equals("*") || s.equals("/") || s.equals("+") || s.equals("-")) {
            return true;
        }
        
        return false;
    }
}