class Solution {
    public boolean isPowerOfThree(int n) {
        // 1162261467 is the largest power of 3 that fits in a 32-bit integer
        return n > 0 && 1162261467 % n == 0;
    }
}