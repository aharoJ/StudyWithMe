package tree;

/**
 * SumRootLeafNumbers_129
 */
public class SumRootLeafNumbers_129 {
  public int sumNumbers(TreeNode root) {
    return helper(root, 0);
  }

  private int helper(TreeNode node, int sum) {
    if (node == null) {
      return 0;
    }

    sum = sum * 10 + node.val;
    if (node.left == null && node.right == null) {
      return sum;
    }

    int searchleft = helper(node.left, sum);
    int searchright = helper(node.right, sum);

    return searchleft + searchright;
  }
}
