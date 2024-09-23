package tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Google Question
 * https://www.geeksforgeeks.org/level-order-successor-of-a-node-in-binary-tree/
 *
 * Consider the following binary tree
 * 20
 * / \
 * 10 26
 * / \ / \
 * 4 18 24 27
 * / \
 * 14 19
 * / \
 * 13 15
 * 
 * Levelorder traversal of given tree is:
 * 20, 10, 26, 4, 18, 24, 27, 14, 19, 13, 15
 * 
 * Input : 24
 * Output : 27
 * 
 * Input : 4
 * Output : 18
 * 
 */
public class LevelOrderSuccessorOfNodeBinaryTree {
  static TreeNode levelOrderSuccessor(TreeNode root, int key) {
    if (root == null) {
      return null;
    }
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    while (!queue.isEmpty()) {
      TreeNode current_node = queue.poll();

      if (current_node.left != null) {
        queue.offer(current_node.left);
      }
      if (current_node.right != null) {
        queue.offer(current_node.right);
      }

      if (current_node.val == key) {
        break;
      }
    }
    return queue.peek();
  }
}
