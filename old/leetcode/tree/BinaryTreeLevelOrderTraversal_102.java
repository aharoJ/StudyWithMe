package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * BinaryTreeLevelOrderTraversal_102
 */
public class BinaryTreeLevelOrderTraversal_102 {
  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    if (root == null) {
      return result;
    }
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    while (!queue.isEmpty()) {
      int levelSize = queue.size();
      List<Integer> inside = new ArrayList<>();
      for (int i = 0; i < levelSize; ++i) {
        TreeNode node = queue.poll();
        inside.add(node.val);
        if (node.left != null) {
          queue.add(node.left);
        }
        if (node.right != null) {
          queue.add(node.right);
        }
      }
      result.add(inside);
    }
    return result;
  }
}
