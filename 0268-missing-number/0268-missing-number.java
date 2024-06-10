class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length-1;
        int totalSum = (n + 1) * (n + 2) / 2; // Sum of numbers from 1 to n+1
        int arraySum = 0;

        for (int num : nums) {
            arraySum += num;
        }

        return totalSum - arraySum;
    }
}