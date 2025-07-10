package hot100;

import hot100.tree.TreeNode;

public class code108 {
    public static void main(String[] args) {
        TreeNode tree = sortedArrayToBST(new int[]{-10, -3, 0, 5, 9});
        System.out.println(tree);

    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = new TreeNode(null, Integer.MAX_VALUE, null);
        recursion(root, 0, nums.length - 1, nums);
        return root.left;
    }

    public static void recursion(TreeNode root, int startIndex, int endIndex, int[] nums) {
        int mid = (startIndex + endIndex) / 2;
        if (mid < startIndex || mid > endIndex)
            return;
        if (nums[mid] < root.val) {
            root.left = new TreeNode(nums[mid]);
            root = root.left;
        } else {
            root.right = new TreeNode(nums[mid]);
            root = root.right;
        }

        recursion(root, startIndex, mid - 1, nums);
        recursion(root, mid + 1, endIndex, nums);
    }

}
