package org.rv.trees;

import org.rv.entity.TreeNode;

public class BalancedBinaryTree {
    boolean isBalancedTree = true;
    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        int hl = height(root.left);
        int hr = height(root.right);
        if (Math.abs(hl-hr) > 1)
            isBalancedTree = false;
        return isBalancedTree;
    }

    private int height(TreeNode root) {
        if (!isBalancedTree)
            return 0;
        if (root == null)
            return 0;
        int hl = height(root.left);
        int hr = height(root.right);
        if (Math.abs(hl-hr) > 1)
            isBalancedTree = false;
        return 1 + Math.max(hl, hr);
    }
}
