class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            while (!st.isEmpty() && temperatures[st.peek()] < temperatures[i]) {
                int x = st.pop();
                ans[x] = i - x;
            }
            st.push(i);
        }
        while (!st.isEmpty()) {
            int x = st.pop();
            ans[x] = 0;
        }
        return ans;
    }
}