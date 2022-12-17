class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens == null || tokens.length == 0) return 0;
        Deque<Integer> stack = new LinkedList<>();
        String operators = "+-*/";
        for(int i=0; i<tokens.length; i++){
            if(operators.contains(tokens[i])){
                int num1 = stack.pop();
                int num2 = stack.pop();
                if(tokens[i].equals("+")) stack.push(num2 + num1);
                else if(tokens[i].equals("-"))stack.push(num2 - num1);
                else if(tokens[i].equals("*"))stack.push(num2 * num1);
                else if(tokens[i].equals("/"))stack.push(num2 / num1);
            }else stack.push(Integer.valueOf(tokens[i]));
        }
        return stack.peek();
    }
}