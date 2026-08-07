class Solution {
    public int maxSubArray(int[] nums) {
      /*  int maxsum = nums[0];

        for (int i = 0; i < nums.length; i++) {

            int currentsum = 0;

            for (int j = i; j < nums.length; j++) {

                currentsum += nums[j];

                if (currentsum > maxsum) {
                    maxsum = currentsum;
                }
            }
        }
        return maxsum; */

        int maxsum = nums[0];
        int currentsum = 0;
        
        for (int i = 0; i < nums.length; i++) {

            currentsum = Math.max(nums[i] , nums[i] + currentsum);

            maxsum = Math.max(maxsum, currentsum);
        }
        return maxsum;
    }
}