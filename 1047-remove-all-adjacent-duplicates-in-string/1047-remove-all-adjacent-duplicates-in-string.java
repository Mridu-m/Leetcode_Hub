class Solution {
    public String removeDuplicates(String s) {
        char[] arr = new char[s.length()];
        int top = -1;
        for(int i = 0; i < s.length(); i++) {
            if(top != -1 && arr[top] == s.charAt(i)) {
                top--;
            }
            else {
                top++;
                arr[top] = s.charAt(i);
            }
        }
        StringBuilder str = new StringBuilder();
        for(int i = 0; i <= top; i++) {
            str.append(arr[i]);
        }
        return str.toString();
    }
}