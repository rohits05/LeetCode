class Solution {                        // Shunting Yard algorithm
    public int calculate(String s) {          
        Queue<String> queue = new ArrayDeque();
        Deque<Character> stack = new ArrayDeque();
        int len = s.length();        
        boolean checkUnary = true;
        
        for(int i=0; i<len; i++){
            char c = s.charAt(i);
            if(Character.isWhitespace(c)) continue;
            
            if(checkUnary){  checkUnary = false;
                if(c == '+' || c == '-') queue.add("0");
            }
            
            if(Character.isDigit(c)){ int num = c - '0';
                while(i+1 < len && Character.isDigit(s.charAt(i+1))){
                    num = num * 10 + s.charAt(i + 1) - '0'; i++;
                }
                queue.add(String.valueOf(num));
            }else if(c == '('){
                checkUnary = true;
                stack.push(c);
            }else if(c == ')'){
                while(stack.peek() != '(') queue.add(String.valueOf(stack.pop()));
                stack.pop();
            }else{
                while(!stack.isEmpty() && stack.peek() != '(' && getPrecedence(c) <= getPrecedence(stack.peek())) queue.add(String.valueOf(stack.pop()));   
                stack.push(c);
            }
        }
        
        while (!stack.isEmpty())
            queue.add(String.valueOf(stack.pop())); 
        return evaluateRPN(queue);
    }
    
    private int getPrecedence(char c) {
        if(c == '*' || c == '/') return 2;
        else return 1;
    }
    
    private int evaluateRPN(Queue<String> queue) {        
        Deque<Integer> numstack = new ArrayDeque();
        int first = 0, second = 0;
        
        while(!queue.isEmpty()){
            String token = queue.poll();
            if(token.equals("+")){
                second = numstack.pop();
                first = numstack.pop();
                numstack.push(first + second);
            }else if(token.equals("-")){
                second = numstack.pop();
                first = numstack.pop();
                numstack.push(first - second);
            }else if(token.equals("*")){
                second = numstack.pop();
                first = numstack.pop();
                numstack.push(first * second);
            }else if(token.equals("/")){
                second = numstack.pop();
                first = numstack.pop();
                numstack.push(first / second);
            }else numstack.push(Integer.valueOf(token));
        }
        return numstack.pop();
    }
}