package tree;

/**
 * KthSmallestElementBST_230
 */
public class KthSmallestElementBST_230 {
  int count = 0;
  int result = 0;

  public int kthSmallest(TreeNode root, int k) {
    helper(root, k);
    return result;
  }

  public void helper(TreeNode root, int k) {
    if (root == null) {
      return;
    }

    helper(root.left, k); // Traverse the left subtree

    count++;
    if (count == k) {
      result = root.val; // Store the value directly in result
      return;
    }

    helper(root.right, k); // Traverse the right subtree
  }
}
