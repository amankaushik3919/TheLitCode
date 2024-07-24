/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int x = minDepth(root.left) + 1;
        int y = minDepth(root.right) + 1;
        if(root.left == null) {
            return y;
        }else if(root.right == null) {
            return x;
        }
        //if(root.left == null && root.right == null) {
        //    return Math.min(x, y);
        //}
        return Math.min(x, y);
    }
}