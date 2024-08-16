import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> nl = new ArrayList<>();

        int right = matrix[0].length - 1;
        int bottom = matrix.length - 1;
        int top = 0;
        int left = 0;

        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; ++i) {
                nl.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; ++i) {
                nl.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; --i) {
                    nl.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; --i) {
                    nl.add(matrix[i][left]);
                }
                left++;
            }
        }
        return nl;
    }
}
