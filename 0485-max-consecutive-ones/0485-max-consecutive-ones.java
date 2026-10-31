class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int counter = 0;
        int maxcount = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {
                counter++;
                maxcount = Math.max(counter, maxcount);
            }
            else {
                counter = 0;
            }
        }
        return maxcount;
    }
}