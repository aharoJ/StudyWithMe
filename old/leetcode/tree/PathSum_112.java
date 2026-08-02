package tree;

/**
 * PathSum_112
 */
public class PathSum_112 {
  public boolean hasPathSum(TreeNode root, int targetSum) {
    if (root == null) {
      return false;
    }
    targetSum -= root.val;
    if (root.left == null && root.right == null) {
      if (targetSum == 0) {
        return true;
      }
    }
    boolean searchleft = hasPathSum(root.left, targetSum);
    boolean searchright = hasPathSum(root.right, targetSum);

    return searchleft || searchright;
  }
}
