import java.util.*;

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int count = 0;
        int lessThanTarget = 0;

        // Count occurrences of target and numbers less than target
        for (int num : nums) {
            if (num == target) {
                count++;
            } else if (num < target) {
                lessThanTarget++;
            }
        }

        // Generate the target indices
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            result.add(lessThanTarget + i);
        }

        return result;
    }
}