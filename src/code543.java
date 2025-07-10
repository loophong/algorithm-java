import hot100.tree.TreeNode;

public class code543 {

    int max = Integer.MIN_VALUE;

    public int diameterOfBinaryTree(TreeNode root) {
        recursion(root);
        return max;
    }

    public int recursion(TreeNode root) {
        if (root == null) return 0;

        int leftDepth = recursion(root.left);
        int rightDepth = recursion(root.right);
        max = Math.max(max, leftDepth + rightDepth);

        return Math.max(leftDepth, rightDepth) + 1;
    }
}
