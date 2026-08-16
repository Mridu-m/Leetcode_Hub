class Solution {
    private boolean isUpperOrLower(char ch) { // upper -> true | lower -> false
        return ch >= 65 && ch <= 90;
    }
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(stack.isEmpty()) {
                stack.push(ch);
            }
            else if( isUpperOrLower(stack.peek()) && !isUpperOrLower(ch) && (stack.peek() + 32 == ch) ) { // s[i] (U) == s[i+1] (L)
                stack.pop();
            }
            else if( !isUpperOrLower(stack.peek()) && isUpperOrLower(ch) && (stack.peek() - 32 == ch) ) { // s[i] (L) == s[i+1] (U)
                stack.pop();
            }
            else {
                stack.push(ch);
            }
        }
        StringBuilder str = new StringBuilder();
        while(!stack.isEmpty()) {
            str.append(stack.pop());
        }
        return str.reverse().toString();
    }
}