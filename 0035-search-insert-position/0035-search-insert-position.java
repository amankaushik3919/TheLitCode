class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = 0;
        int m = nums.length - 1;
        int mid = 0;
        while (n <= m) {
            mid = n + (m-n) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] < target) {
                n = mid + 1;
            }
            else {
                m = mid - 1;
            }
        }
        return n;
    }
}