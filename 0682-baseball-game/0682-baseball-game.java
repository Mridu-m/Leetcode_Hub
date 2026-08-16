class Solution {
    public int calPoints(String[] operations) {
        int[] st = new int[operations.length];
        int top = -1;
        for(int i = 0; i < operations.length; i++) {
            if(top >= 1 && operations[i].equals("+")) {
                top++;
                st[top] = st[top - 1] + st[top - 2];
            }
            else if(top > -1 && operations[i].equals("D")) {
                top++;
                st[top] = 2 * st[top - 1];
            }
            else if(top > -1 && operations[i].equals("C")) {
                top--;
            }
            else {
                top++;
                st[top] = Integer.parseInt(operations[i]);
            }
        }
        int sum = 0;
        for(int i = 0; i <= top; i++) {
            sum += st[i];
        }
        return sum;
    }
}