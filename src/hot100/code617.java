package hot100;

import hot100.tree.TreeNode;

public class code617 {

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {


        if (root1 != null && root2 != null) {
            root1.val = root1.val + root2.val;
        }else if(root1 == null && root2 != null){
            return root2;
        }else if(root1 != null && root2 == null){
            return root1;
        }else if(root1 == null && root2 == null){
            return null;
        }

        if (root1.left == null && root2.left != null) {
            root1.left = root2.left;
        } else if (root1.left != null && root2.left != null) {
            root1.left = mergeTrees(root1.left, root2.left);
        }

        if (root1.right == null && root2.right != null) {
            root1.right = root2.right;
        } else if (root1.right != null && root2.right != null) {
            root1.right = mergeTrees(root1.right, root2.right);
        }

        return root1;


    }
}
