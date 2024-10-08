package tree;

/**
 * DiameterBinaryTree_543
 */
public class DiameterBinaryTree_543 {
  private int diameter = 0;

  public int diameterOfBinaryTree(TreeNode root) {
    height(root);
    return diameter;
  }

  private int height(TreeNode node) {
    if (node == null) {
      return 0;
    }
    int leftHeight = height(node.left);
    int rightHeight = height(node.right);
    diameter = Math.max(diameter, leftHeight + rightHeight);

    return Math.max(leftHeight, rightHeight) + 1;
  }
}
