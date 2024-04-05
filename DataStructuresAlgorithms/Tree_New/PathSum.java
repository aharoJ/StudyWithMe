package Tree_New;


public class PathSum extends Tree{
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return helper(root, 0, targetSum);
    }

    public boolean helper(TreeNode node, int summation, int targetSum) {
        if (node == null) {
            return false;
        }

        summation += node.val;
        if (node.left == null && node.right == null) {
            if (targetSum == summation) {
                return true;
            }
            return false;
        }
        return helper(node.left, summation, targetSum) || helper(node.right, summation, targetSum);

    }
}
