class Solution {
    public int evalRPN(String[] tokens) {
        int[] stack = new int[tokens.length];
        int top = -1;
        for(int i = 0; i < tokens.length; i++) {
            if(top >= 1 && tokens[i].equals("+")) {
                int x = stack[top - 1] + stack[top];
                top--;
                stack[top] = x;
            }
            else if(top >= 1 && tokens[i].equals("-")) {
                int x = stack[top - 1] - stack[top];
                top--;
                stack[top] = x;
            }
            else if(top >= 1 && tokens[i].equals("*")) {
                int x = stack[top - 1] * stack[top];
                top--;
                stack[top] = x;
            }
            else if(top >= 1 && tokens[i].equals("/")) {
                int x = stack[top - 1] / stack[top];
                top--;
                stack[top] = x;
            }
            else {
                top++;
                stack[top] = Integer.parseInt(tokens[i]);
            }
        }
        return stack[top];
    }
}