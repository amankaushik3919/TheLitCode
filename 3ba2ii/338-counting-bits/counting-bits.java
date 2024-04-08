class Solution {
    public int[] countBits(int n) {
        int[] li = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            String binaryString = Integer.toBinaryString(i);
            int count = 0;
            for (int j = 0; j < binaryString.length(); j++) {
                if (binaryString.charAt(j) == '1') {
                    count++;
                }
            }
            li[i] = count;
        }
        return li;
    }
}