class Solution {
    int len(int n) {
        int count = 0;
        while(n>0) {
            n/=10;
            count++;
        }
        return count;
    }
    public int findNumbers(int[] nums) {
        int c = 0;
        for(int i=0; i<nums.length; i++ ) {
            int a = len(nums[i]);
            
            if(a%2 == 0) {
                c++;
            }
        }
        return c;
    }
}