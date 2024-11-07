class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> i = new HashMap<>();
        for (int num: nums) {
            i.put(num, i.getOrDefault(num, 0)+1);
        }

        for (Map.Entry<Integer, Integer> entry: i.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1; 
    }
}