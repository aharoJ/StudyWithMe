package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Questions
 */
public class Questions {
  public static void main(String[] args) {

  }

  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    if (root == null) {
      return result;
    }
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    while (!queue.isEmpty()) {
      int levelSize = queue.size();
      List<Integer> currentLevel = new ArrayList<>(levelSize);
      for (int i = 0; i < levelSize; i++) {
        TreeNode current_node = queue.poll();
        currentLevel.add(current_node.val);
        if (current_node.left != null) {
          queue.offer(current_node.left);
        }
        if (current_node.right != null) {
          queue.offer(current_node.right);
        }
      }
      result.add(currentLevel);
    }
    return result;
  }

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

  private class TreeNode {
    private int val;
    private int height;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
      this.val = val;
    }
  }

}
