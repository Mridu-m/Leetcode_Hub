class Solution {
    // Method 2 : HashMap
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            if(map.containsKey(nums[i])) return true;
            else map.put(nums[i], 1);
        }
        return false;
    }
    /*
    // Method 2 : Sorting
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i+1]) return true;
        }
        return false;
    }
    */
}