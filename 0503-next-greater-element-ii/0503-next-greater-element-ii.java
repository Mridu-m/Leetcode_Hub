class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < 2 * nums.length; i++) {
            while(!st.isEmpty() && nums[st.peek()] < nums[i % nums.length]) {
                map.put(st.pop(), nums[i % nums.length]);
            }
            if(i < nums.length) st.push(i);
        }
        while(!st.isEmpty()) {
            map.put(st.pop(), -1);
        }
        for(int i = 0; i < nums.length; i++) {
            nums[i] = map.get(i);
        }
        return nums;
    }
}