class Solution {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int big = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                if (big < count) {
                    big = count;
                }
            }
            else {
                count = 0;
            }
        }
        return big;
    }
}
