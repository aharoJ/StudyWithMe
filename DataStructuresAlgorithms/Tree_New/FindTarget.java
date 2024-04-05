package Tree_New;

public class FindTarget extends Tree {
    public boolean findTarget(TreeNode root, int target) {
        return helper(root, target, 0);
    }

    public boolean helper(TreeNode node, int target, int summation) {

        if (node == null) {
            return false;
        }

        if (node.left != null && node.right != null) {
            summation += node.left.val;
            summation += node.right.val;
        }

        if (summation == target) {
            return true;
        }

        return helper(node.left, target, summation) && helper(node.right, target, summation);

    }
}
