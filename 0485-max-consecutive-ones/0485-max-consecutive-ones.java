class Solution {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int big = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (big < count) {
                    big = count;
                    count = 0;
                } else {
                    count = 0;
                }
            } else if (nums[i] == 1) {
                count++;
                if (big < count) {
                    big = count;
                    //count = 0;
                }
                
            }
        }
        return big;
    }
}
