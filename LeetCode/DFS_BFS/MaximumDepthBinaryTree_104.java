
public class MaximumDepthBinaryTree_104 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        if (root.left != null && root.right != null) {
            left++;
            right++;
        }
        int max = Math.max(left, right) + 1;

        return max;
    }

}
