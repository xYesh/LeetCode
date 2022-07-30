class Solution {
    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ']') {
                
                List<Character> str = new ArrayList();
                
                while (stack.peek() != '[') {
                    str.add(stack.pop());
                }
                
                stack.pop();
                
                int count = 0;
                int base = 1;
                while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    count = count + (stack.pop() - '0') * base; base = base * 10;
                }
                
                for (int k=0; k<count; k++) {
                    for (int j=str.size()-1; j>=0; j--) {
                        stack.add(str.get(j)); 
                    }
                }
            } else {
                stack.add(ch);           
            }
        }
        
        // get the result from stack
        char[] result = new char[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return new String(result);
        
    }
}