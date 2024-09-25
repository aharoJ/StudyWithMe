package tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * BinaryTreeZigzagLevelOrderTraversal_103
 */
public class BinaryTreeZigzagLevelOrderTraversal_103 {
  public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    if (root == null) {
      return result;
    }
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    boolean leftToRight = true;

    while (!queue.isEmpty()) {
      int levelSize = queue.size();
      List<Integer> inside = new ArrayList<>();
      for (int i = 0; i < levelSize; i++) {
        TreeNode node = queue.poll();
        inside.add(node.val);

        if (node.left != null) {
          queue.offer(node.left);
        }
        if (node.right != null) {
          queue.offer(node.right);
        }
      }
      if (!leftToRight) {
        Collections.reverse(inside); // Reverse the list for zigzag order
      }
      result.add(inside);
      leftToRight = !leftToRight; // Toggle the direction for the next level
    }
    return result;
  }
}
