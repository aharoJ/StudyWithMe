package tree;

/**
 * I found very hard
 */
public class CousinsBinaryTree_993 {
  public boolean isCousins(TreeNode root, int x, int y) {
    TreeNode xx = findNode(root, x);
    TreeNode yy = findNode(root, y);
    return ((level(root, xx, 0) == level(root, yy, 0)) && (!isSibling(root, xx, yy)));
  }

  static TreeNode findNode(TreeNode node, int target) {
    if (node == null) {
      return null;
    }
    if (node.val == target) {
      return node;
    }

    TreeNode nth = findNode(node.left, target);
    if (nth != null) { // found in left subtree
      return nth;
    }

    return findNode(node.right, target);
  }

  boolean isSibling(TreeNode node, TreeNode x, TreeNode y) {
    if (node == null) {
      return false;
    }

    return ((node.left == x && node.right == y) || (node.left == y && node.right == x)
        || isSibling(node.left, x, y) || isSibling(node.right, x, y));
  }

  int level(TreeNode node, TreeNode x, int lev) {
    if (node == null) {
      return 0;
    }
    if (node == x) {
      return lev;
    }
    int l = level(node.left, x, lev + 1);
    if (l != 0) {
      return l;
    }
    return level(node.right, x, lev + 1);
  }
}
