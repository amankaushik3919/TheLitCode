class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr = new int[nums.length * 2];
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < nums.length * 2; i++) {
                if (i < nums.length) {
                    arr[i] = nums[i];
                } else {
                    arr[i] = nums[i - nums.length];
                }
            }
        }
        return arr;
    }
}
