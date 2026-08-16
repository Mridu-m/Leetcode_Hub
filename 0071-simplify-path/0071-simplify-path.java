class Solution {
    public String simplifyPath(String path) {
        // Stack<String> st = new Stack<>();
        String[] st = new String[path.length()];
        int top = -1;
        int i = 0;
        while (i < path.length()) {
            if (path.charAt(i) == '/') {
                i++;
                continue;
            }
            int j = i;
            while (j < path.length() && path.charAt(j) != '/') j++;

            String sub_str = path.substring(i, j);

            if (top >= 0 && sub_str.equals("..")) {
                top--;
            }
            else if ( !sub_str.equals("..") && !sub_str.equals(".") ) {
                top++;
                st[top] = path.substring(i, j);
            }
            i = j;
        }

        if(top == -1) {
            return "/";
        }
        else {
            StringBuilder s = new StringBuilder();
            for(int k = 0; k <= top; k++) {
                s.append('/');
                s.append(st[k]);
            }
            return s.toString();
        }
    }
}