class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int candidate1 = 0;
        int candidate2 = 0;

        int count1 = 0;
        int count2 = 0;

        // Phase 1: Candidate selection
        for (int num : nums) {

            if (num == candidate1) {
                count1++;
            }
            else if (num == candidate2) {
                count2++;
            }
            else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            }
            else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            }
            else {
                count1--;
                count2--;
            }
        }

        // Phase 2: Verification
        int actualCount1 = 0;
        int actualCount2 = 0;

        for (int num : nums) {

            if (num == candidate1) {
                actualCount1++;
            }

            if (candidate1 != candidate2 && num == candidate2) {
                actualCount2++;
            }
        }

        List<Integer> result = new ArrayList<>();

        if (actualCount1 > nums.length / 3) {
            result.add(candidate1);
        }

        if (candidate1 != candidate2 && actualCount2 > nums.length / 3) {
            result.add(candidate2);
        }

        return result;
    }
}