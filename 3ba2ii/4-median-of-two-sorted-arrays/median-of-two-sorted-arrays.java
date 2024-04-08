class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double aa;
        int ms = nums1.length + nums2.length;
        int l1 = nums1.length;
        int l2 = nums2.length;
        int i = 0;
        int j = 0;
        int temp = 0;
        int merged[] = new int[ms];
        while (i < l1) {
            merged[i] = nums1[i];
            i++;
        }
        while (j < l2) {
            merged[l1 + j] = nums2[j];
            j++;
        }

        // sorting

        for (i = 0; i < ms; i++) {
            for (j = i + 1; j < ms; j++) {
                if (merged[j] < merged[i]) {
                    temp = merged[j];
                    merged[j] = merged[i];
                    merged[i] = temp;
                    }
            }
        }

        if ((ms % 2) != 0) {
            return (merged[((ms + 1) / 2) - 1]); // (ms+1)/2 == n+1/2
        } else {
            double first, second;
            first = merged[((ms / 2) - 1)];
            second = merged[(ms / 2)];
            aa = (first+second)/2;
            return (aa);
        }
    }
}