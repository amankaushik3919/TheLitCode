class Solution {
    public void moveZeroes(int[] nums) {
        int lastNonZeroFoundAt = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Swap non-zero element with the element at lastNonZeroFoundAt
                int temp = nums[lastNonZeroFoundAt];
                nums[lastNonZeroFoundAt++] = nums[i];
                nums[i] = temp;
            }
        }

        // Print the result for verification
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}