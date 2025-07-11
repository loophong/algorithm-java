package hot100;

import hot100.tree.TreeNode;

public class code114 {
    public void flatten(TreeNode root) {
        recursion(root);
    }

    public void recursion(TreeNode root) {
        if (root == null)
            return;

        if (root.left != null) {
            TreeNode temp = root.right;
            TreeNode rightNode = findRightNode(root.left);
            root.right = root.left;
            root.left = null;
            rightNode.right = temp;
        }
        recursion(root.right);
    }

    public TreeNode findRightNode(TreeNode root) {
        if (root.right == null)
            return root;
        return findRightNode(root.right);
    }


}
