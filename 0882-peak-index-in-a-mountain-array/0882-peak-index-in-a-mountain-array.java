class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        /*
         * for(int i=1; i<arr.length-1; i++){
         * if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
         * return i;
         * }
         * }
         */
        int low = 1, high = arr.length - 1;
        while (low < high) {
            if (arr[low - 1] < arr[low] && arr[low] > arr[low + 1]) {
                return low;
            }
            low++;
        }
        return -1;
    }
}
