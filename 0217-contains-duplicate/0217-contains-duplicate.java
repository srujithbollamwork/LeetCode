class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Set<Integer> setmap = new HashSet<Integer>();

        for (int num : nums) {
            if (setmap.contains(num)) {
                return true;
            }

            setmap.add(num);
        }
        return false;
    }
}