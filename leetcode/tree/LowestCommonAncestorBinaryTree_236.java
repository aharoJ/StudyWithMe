package tree;

/**
 * LowestCommonAncestorBinaryTree_236
 */
public class LowestCommonAncestorBinaryTree_236 {
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if (root == null) {
      return null;
    }

    if (root == p || root == q) {
      return root;
    }

    TreeNode checkleft = lowestCommonAncestor(root.left, p, q);
    TreeNode checkright = lowestCommonAncestor(root.right, p, q);

    if (checkleft != null && checkright != null) {
      return root;
    }

    return checkleft == null ? checkright : checkleft;
  }
}
