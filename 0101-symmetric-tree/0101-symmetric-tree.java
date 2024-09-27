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
    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isEqual(root, root);
    }

    public static boolean isEqual(TreeNode p, TreeNode q) {
        if (p == null || q == null){
            return p == q;
        }
        return p.val == q.val && isEqual(p.left, q.right) && isEqual(p.right, q.left);
    }
}