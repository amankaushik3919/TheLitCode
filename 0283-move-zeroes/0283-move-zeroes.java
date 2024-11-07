class Solution {
    public void moveZeroes(int[] nums) {
        int lastNonZeroFoundAt = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZeroFoundAt++] = nums[i];
            }
        }

        while (lastNonZeroFoundAt < nums.length) {
            nums[lastNonZeroFoundAt++] = 0;
        }

        // Print the result for verification
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}