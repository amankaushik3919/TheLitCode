class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List nl = new ArrayList<>();

        int right = matrix[0].length - 1;
        int bottom = matrix.length - 1;
        int top = 0;
        int left = 0;
        //int p = 0;

        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; ++i) {
                nl.add(matrix[top][i]);
                //p++;
            }
            top++;
            for (int i = top; i <= bottom; ++i) {
                nl.add(matrix[i][right]);
                //p++;
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; --i) {
                    nl.add(matrix[bottom][i]);
                    //p++;
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; --i) {
                    nl.add(matrix[i][left]);
                    //p++;
                }
                left++;
            }
        }
        return nl;
    }
}