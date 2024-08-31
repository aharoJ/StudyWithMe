package trees.treepractice;



public class TreeProblem {
    public static void main(String[] args) {
        // Construct a binary tree to test
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(20);

        // Create a Solution object and test the isValidBST method
        Solution solution = new Solution();
        boolean isValid = solution.isValidBST(root);
        System.out.println("Is the binary tree a valid BST? " + isValid);
    }
}
