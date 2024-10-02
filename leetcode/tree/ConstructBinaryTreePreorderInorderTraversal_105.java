package tree;

import java.util.HashMap;
import java.util.Map;

/**
 * ConstructBinaryTreePreorderInorderTraversal_105
 */
public class ConstructBinaryTreePreorderInorderTraversal_105 {
  private int index = 0;

  public TreeNode buildTree(int[] preorder, int[] inorder) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < inorder.length; i++) {
      map.put(inorder[i], i);
    }
    return helper(preorder, inorder, 0, preorder.length - 1, map);
  }

  private TreeNode helper(int[] preorder, int[] inorder, int left, int right,
      Map<Integer, Integer> map) {
    if (left > right) {
      return null;
    }
    int current = preorder[index];
    index++;

    TreeNode node = new TreeNode(current);

    if (left == right) {
      return node;
    }

    int inorderIndex = map.get(current);

    node.left = helper(preorder, inorder, left, inorderIndex - 1, map);
    node.right = helper(preorder, inorder, inorderIndex + 1, right, map);

    return node;
  }
}
