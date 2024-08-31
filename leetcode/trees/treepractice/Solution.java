package trees.treepractice;

public class Solution {
  protected boolean isValidBST(TreeNode root) {
    return validate(root, null, null);
  }

  private boolean validate(TreeNode node, Integer low, Integer high) {
    if (node == null) {
      return true;
    }

    // Print the current bounds and the node value
    System.out.println("Node: " + node.val + ", Low: " + low + ", High: " + high);

    if ((low != null && node.val <= low) || (high != null && node.val >= high)) {
      return false;
    }

    // Recursively validate the left and right subtrees
    boolean leftIsValid = validate(node.left, low, node.val);
    boolean rightIsValid = validate(node.right, node.val, high);
    return leftIsValid && rightIsValid;
  }
}
