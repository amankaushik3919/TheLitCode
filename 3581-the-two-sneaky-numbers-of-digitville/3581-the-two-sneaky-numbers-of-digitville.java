class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        // Create a HashMap to store elements and their frequencies
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate over the input array and count frequencies of elements
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // Create a list to store the duplicate elements
        ArrayList<Integer> duplicates = new ArrayList<>();

        // Iterate through the HashMap to find duplicates (frequency > 1)
        for (Integer key : map.keySet()) {
            if (map.get(key) > 1) {
                duplicates.add(key);
            }
        }

        // Convert the list of duplicates to an array
        int[] duplicateArray = new int[duplicates.size()];
        for (int i = 0; i < duplicates.size(); i++) {
            duplicateArray[i] = duplicates.get(i);
        }

        // Return the array of duplicate elements
        return duplicateArray;
    }
}