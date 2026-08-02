package tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * MaximumDepthBinaryTree_104
 */
public class MaximumDepthBinaryTree_104 {
  public int BFS(TreeNode root) {
    // public int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    int depth = 0;
    while (!queue.isEmpty()) {
      int levelSize = queue.size();
      for (int i = 0; i < levelSize; ++i) {
        TreeNode node = queue.poll();
        if (node.left != null) {
          queue.offer(node.left);
        }
        if (node.right != null) {
          queue.offer(node.right);
        }
      }
      depth++;
    }
    return depth;
  }

  public int DFS(TreeNode root) {
    // public int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int leftHeight = maxDepth(root.left);
    int rightHeight = maxDepth(root.right);

    return Math.max(leftHeight, rightHeight) + 1;
  }
}
