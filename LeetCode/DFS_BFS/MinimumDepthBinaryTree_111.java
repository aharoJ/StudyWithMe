
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * }
 * }
 */
public class MinimumDepthBinaryTree_111 {

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = minDepth(root.left);
        int right = minDepth(root.right);

        if (root.left == null) {
            return right + 1;
        }

        if (root.right == null) {
            return left + 1;
        }

        int min = Math.min(left, right) + 1;
        return min;
    }
}
