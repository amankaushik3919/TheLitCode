class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> ar = new HashSet<>();
        for(int i=0; i<nums.length; i++) {
            if(ar.contains(nums[i])) {
                return true;
            }
            ar.add(nums[i]);
        }
        return false;
    }
}