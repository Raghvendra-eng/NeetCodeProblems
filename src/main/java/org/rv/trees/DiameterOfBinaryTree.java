package org.rv.trees;

/**
 * The diameter of a binary tree is defined as the length of the longest path between any two nodes within the tree.
 * The path does not necessarily have to pass through the root.
 *
 * The length of a path between two nodes in a binary tree is the number of edges between the nodes.
 *
 * Given the root of a binary tree root, return the diameter of the tree.
 */
public class DiameterOfBinaryTree {
    private static int ans = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        ans = 0;
        if (root == null)
            return 0;
        int leftDepth = depth(root.left);
        int rightDepth = depth(root.right);
        ans = Math.max(ans, leftDepth + rightDepth);
        return ans;
    }

    public int depth(TreeNode root) {
        if (root == null)
            return 0;
        int left = depth(root.left);
        int right = depth(root.right);
        ans = Math.max(ans, left + right);
        return 1 + Math.max(left, right);
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
