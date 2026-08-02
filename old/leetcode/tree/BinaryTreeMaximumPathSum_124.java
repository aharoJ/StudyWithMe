package tree;

/**
 * BinaryTreeMaximumPathSum_124
 */
public class BinaryTreeMaximumPathSum_124 {
  private int sol = Integer.MIN_VALUE;

  public int maxPathSum(TreeNode root) {
    helper(root);
    return sol;
  }

  private int helper(TreeNode node) {
    if (node == null) {
      return 0;
    }

    int searchleft = Math.max(helper(node.left), 0);
    int searchright = Math.max(helper(node.right), 0);

    // Calculate the maximum path sum passing through the current node
    sol = Math.max(sol, node.val + searchleft + searchright);

    // Return the maximum path sum that can be extended to the parent node
    return node.val + Math.max(searchleft, searchright);
  }
}
