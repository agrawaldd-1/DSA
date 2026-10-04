class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int first = 0;
        int second = 0;
        for(String token : tokens){
            if(token.equals("+")){
                second = stack.pop();
                first = stack.pop();
                stack.push(first+second);
            }
            else if(token.equals("-")){
                second = stack.pop();
                first = stack.pop();
                stack.push(first-second);
            }
            else if(token.equals("*")){
                second = stack.pop();
                first = stack.pop();
                stack.push(first*second);
            }
            else if(token.equals("/")){
                second = stack.pop();
                first = stack.pop();
                stack.push(first/second);
            }
            else{
                stack.push(Integer.parseInt(token));
            }

        }
        return stack.pop();

    }
}