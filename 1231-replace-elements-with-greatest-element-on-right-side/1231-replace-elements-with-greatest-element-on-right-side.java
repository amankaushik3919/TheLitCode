class Solution {
    public int[] replaceElements(int[] arr) {
        int max = -1, nmax = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (max < arr[i]) {
                nmax = arr[i];
            }
            arr[i] = max;
            max = nmax;
        }
        return arr;
    }
}