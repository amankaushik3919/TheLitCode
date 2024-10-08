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
    public boolean left=false, right=false;
    public boolean evaluateTree(TreeNode root) {
                if (root == null) {
            return false;
        }
        if (root.val == 0) {
            return false;
        }
        if (root.val == 1 && (root.left == null && root.right == null)) {
            return true;
        }

        boolean left = evaluateTree(root.left);
        boolean right = evaluateTree(root.right);

        if (root.val == 2 && (root.left != null && root.right != null)) {
            return left | right;
        }
        if (root.val == 3 && (root.left != null && root.right != null)) {
            return left & right;
        }

        return left | right;
    }
}
