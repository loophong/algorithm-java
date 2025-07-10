package hot100;

import hot100.tree.TreeNode;

public class code101 {
    public boolean isSymmetric(TreeNode root) {
        int[] result = {1};
        recursion(root.left, root.right, result);
        return result[0] == 1;
    }

    public void recursion(TreeNode left, TreeNode right, int[] result) {
        if (left == null && right == null) {
            return;
        } else if (left == null || right == null) {
            result[0] = 0;
            return;
        }

        if (left.val != right.val)
            result[0] = 0;
        recursion(left.left, right.right, result);
        recursion(left.right, right.left, result);
    }
}
