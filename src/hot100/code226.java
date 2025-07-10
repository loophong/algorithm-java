package hot100;

import hot100.tree.TreeNode;

public class code226 {


    public TreeNode invertTree(TreeNode root) {
        recursion(root);
        return root;
    }

    public void recursion(TreeNode root) {
        if (root == null)
            return;
        TreeNode left = root.left;
        root.left = root.right;
        root.right = left;
        recursion(root.left);
        recursion(root.right);
    }
}
