package hot100;

import hot100.tree.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class code199 {
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        if (root != null)
            queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.removeFirst();
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
                if (i == size - 1)
                    result.add(node.val);
            }
        }
        return result;
    }
}
