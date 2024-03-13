package Tree.NormalTree;

public class FindMaxValue {
    public TreeNode root;

    public void createBinaryTree() {
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(8);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);
        TreeNode seventh = new TreeNode(7);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        third.left = sixth;
        third.right = seventh;
    }

    public int findMax(TreeNode root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int result = root.data;
        int left = findMax(root.left);
        int right = findMax(root.right);

        if (left > result) {
            result = left;
        }

        if (right > result) {
            result = right;
        }
        return result;
    }

    public static void main(String[] args) {
        FindMaxValue tree = new FindMaxValue();
        tree.createBinaryTree();
        // tree.findMax(tree.root);
        System.out.println(tree.findMax(tree.root)); // Print the maximum value found
    }
}
