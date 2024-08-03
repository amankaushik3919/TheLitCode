class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0; i<nums.length; i++){
            int temp = nums[i]*nums[i];
            nums[i] = temp;
        }
        Arrays.sort(nums);
        return nums;
    }
}