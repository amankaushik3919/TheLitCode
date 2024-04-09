class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] == nums[i+1]){
                a.add(nums[i]);
                continue;
            }
        }
        return a;
    }
}
