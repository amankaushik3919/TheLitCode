class Solution {
    public void moveZeroes(int[] nums) {
         int lastNonZeroFoundAt = 0; // Keeps track of the position to place the next non-zero element

        // Move all non-zero elements to the beginning of the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZeroFoundAt] = nums[i];
                lastNonZeroFoundAt++;
            }
        }

        // Fill the remaining positions in the array with zeros
        for (int i = lastNonZeroFoundAt; i < nums.length; i++) {
            nums[i] = 0;
        }

        // Print the result for verification
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}