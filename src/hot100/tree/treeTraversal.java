package hot100.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class treeTraversal {

    // 定义树结构
    static TreeNode root = new TreeNode(
            new TreeNode(new TreeNode(4), 2, null),
            1,
            new TreeNode(new TreeNode(5), 3, new TreeNode(6))
    );

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

//        preOrderRecursion(root);
        mediumOrderRecursion(root,list);
        System.out.println(list);
//        afterOrderRecursion(root);

//        preOrderTraversal(root);


    }

    /**
     * @description: 递归遍历
     * @author: hong
     * @date: 2025/1/21 10:49
     * @version: 1.0
     */
    // 1、前序
    static void preOrderRecursion(TreeNode treeNode) {
        System.out.println(treeNode);
        if (treeNode.left != null) {
            preOrderRecursion(treeNode.left);
        }
        if (treeNode.right != null) {
            preOrderRecursion(treeNode.right);
        }
    }


    // 2、中序
    static void mediumOrderRecursion(TreeNode treeNode,List<Integer> list) {
        if (treeNode.left != null) {
            mediumOrderRecursion(treeNode.left,list);
        }
//        System.out.println(treeNode);
        list.add(treeNode.val);
        if (treeNode.right != null) {
            mediumOrderRecursion(treeNode.right,list);
        }
    }

    // 3、后序
    static void afterOrderRecursion(TreeNode treeNode) {
        if (treeNode.left != null) {
            afterOrderRecursion(treeNode.left);
        }
        if (treeNode.right != null) {
            afterOrderRecursion(treeNode.right);
        }
        System.out.println(treeNode);
    }

    /**
     * @description: 非递归遍历
     * @author: hong
     * @date: 2025/1/21 10:49
     * @version: 1.0
     */
    static void preOrderTraversal(TreeNode treeNode) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = treeNode;
        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                System.out.println(cur);
                stack.push(cur);
                cur = cur.left;
            } else {
                cur = stack.pop();
                cur = cur.right;
            }
        }
    }

    static void afterOrderTraversal(TreeNode treeNode) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = treeNode;
        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            } else {
                cur = stack.pop();
                System.out.println(cur);
                cur = cur.right;
            }
        }
    }


}
