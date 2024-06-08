package Tree_New;

public class Tree {
    protected TreeNode root;

    public void insert(int val) {
        root = insertRec(root, val);
    }

    private TreeNode insertRec(TreeNode current, int val) {
        if (current == null) {
            return new TreeNode(val);
        }
        if (val < current.val) {
            current.left = insertRec(current.left, val);
        } else if (val > current.val) {
            current.right = insertRec(current.right, val);
        }
        return current;
    }

    public void inOrder() {
        inOrderRec(root);
    }

    private void inOrderRec(TreeNode node) {
        if (node != null) {
            inOrderRec(node.left);
            System.out.print(node.val + " ");
            inOrderRec(node.right);
        }
    }
}
