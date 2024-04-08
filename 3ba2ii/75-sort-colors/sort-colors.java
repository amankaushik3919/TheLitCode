class Solution {
    public void sortColors(int[] nums) {
        int temp, min;
        for(int i=0;i<nums.length-1; i++){
            min = i;
            for(int j=i+1; j<nums.length; j++){
                if(nums[min]>nums[j]){
                    min=j;
                }
            }
            if(min!=i){
                temp = nums[min];
                nums[min] = nums[i];
                nums[i] = temp;
            }
        }
    }
}
