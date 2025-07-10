package hot100;

import hot100.tree.TreeNode;

public class code104 {

    public static void main(String[] args) {
        TreeNode tree = new TreeNode(null, 1, new TreeNode(2));
        int depth = maxDepth(tree);
        System.out.println(depth);
    }

    public static int maxDepth(TreeNode root) {
        int maxDeep = 0;
        int[] max = {0};
        recursion(root, max, 0);
        return max[0];
    }

    public static void recursion(TreeNode root, int[] max, Integer curDeep) {
        if (root == null)
            return;
        max[0] = max[0] > ++curDeep ? max[0] : curDeep;
        recursion(root.left, max, curDeep);

        recursion(root.right, max, curDeep);
        --curDeep;
    }
}
