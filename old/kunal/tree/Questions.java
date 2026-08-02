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

  public void flatten(TreeNode root) {
    if (root == null) {
      return;
    }

    TreeNode node = root;
    while (node != null) {
      if (node.left != null) {
        TreeNode rightmost = node.left;
        while (rightmost.right != null) {
          rightmost = rightmost.right;
        }
        rightmost.right = node.right;
        node.right = node.left;
        node.left = null;
      }
      node = node.right;
    }
  }

  boolean existPathUtil(TreeNode node, int[] arr) {
    if (node == null) {
      return arr.length == 0;
    }
    return existPathUtil(node, arr, 0);
  }

  private boolean existPathUtil(TreeNode node, int[] arr, int index) {
    if (node == null) {
      return false;
    }

    if (index >= arr.length || node.val != arr[index]) {
      return false;
    }

    if (node.left == null && node.right == null && index == arr.length - 1) {
      return true;
    }

    return existPathUtil(node.left, arr, index + 1) || existPathUtil(node.right, arr, index + 1);
  }

  public TreeNode buildTree(int[] preorder, int[] inorder) {
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
