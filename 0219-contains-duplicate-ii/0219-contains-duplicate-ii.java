class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            if(map.containsKey(nums[i]) && i != map.get(nums[i])) {
                int dist = Math.abs(i -  map.get(nums[i]));
                if(dist <= k) return true;
                else map.put(nums[i], i);
            }
            else {
                map.put(nums[i], i);
            }
        }
        return false;
    }
    /*
    // Brut Force Technique
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                int dist = Math.abs(i - j);
                if(nums[i] == nums[j] && dist <= k) {
                    return true;
                }
            }
        }
        return false;
    }
    */
}