// Preorder traversal in a binary tree.
// N-ary tree to follow.

import java.util.ArrayList;
import java.util.List;

public class PreorderTraversal {
    // Definition of a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode l, TreeNode r) {
            this.val = val;
            this.left = l;
            this.right = r;
        }
    }

    public static List<Integer> preorder(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        return ret;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);

        System.out.println(preorder(root));
    }
}