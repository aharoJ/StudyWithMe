package trees;

/**
 * SubtreeAnotherTree_572
 */
class Solution {
  public boolean isSubtree(TreeNode root, TreeNode subRoot) {
    if (root == null) {
      return false;
    }
    if (subRoot == null) {
      return true;
    }
    return traverse(root.left, subRoot) || traverse(root.right, subRoot);
  }

  private boolean traverse(TreeNode node1, TreeNode node2) {
    if (node1 == null || node2 == null) {
      return false;
    }

    if (node1 == null && node2 == null) {
      return true;
    }

    if (node1.val != node2.val) {
      return false;
    }
    return traverse(node1.left, node2.left) && traverse(node1.left, node2.left);
  }
}
