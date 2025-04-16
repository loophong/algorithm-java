package hot100.tree;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class maxDepth {
    // 定义树结构
    static TreeNode root = new TreeNode(
            new TreeNode(new TreeNode(4), 2, null),
            1,
            new TreeNode(new TreeNode(5), 3, new TreeNode(6))
    );

    /**
     * @description: 初步思想，层次 + 栈 （队列）
     * @author: hong
     * @date: 2025/4/13 16:04
     * @version: 1.0
     */
    public static void main(String[] args) {


        if (root == null) {
            System.out.println("最大深度 0");
        } else {
            ArrayList<TreeNode> list = new ArrayList<>();
            list.add(root);
            list.add(new TreeNode(null, -101, null));
            int maxDepth = 1;

            int cur = 0;
            do {
                TreeNode node = list.get(cur);
                if (node.val == -101) {
                    list.add(new TreeNode(null, -101, null));
                    maxDepth++;
                }
                if (node.left != null) {
                    list.add(node.left);
                }
                if (node.right != null) {
                    list.add(node.right);
                }
                cur++;
            } while (cur + 1 != list.size());

//            for (TreeNode node : list) {
//                if (node.val == -101) {
//                    maxDepth++;
//                }
//            }
            System.out.println("最大深度 " + maxDepth);
        }

    }
}
