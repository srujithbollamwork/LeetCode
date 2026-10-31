class Solution {
    public void rotate(int[] nums, int k) {
        
        int n = nums.length - 1;

        k = k % nums.length;

        Reverse(nums, 0, n);
        Reverse(nums, 0, k-1);
        Reverse(nums, k, n);
    }

    public static void Reverse(int[] nums, int left, int right) {

        
        while(left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left ++;
            right --;
        }
    }
}