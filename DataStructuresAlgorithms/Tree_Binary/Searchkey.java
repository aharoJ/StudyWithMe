package Tree_Binary;

public class Searchkey {
    public TreeNode root;

    public void insert(int val) {
        root = insert(root, val);
    }

    public TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
            return root;
        }

        if (val < root.val) {
            root.left = insert(root.left, val);
        }

        if (val > root.val) {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public void inOrder() {
        inOrder(root);
    }

    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }

    public TreeNode searchForKey(TreeNode root, int key) {
        if (root == null || root.val == key) {
            return root;
        }

        if (root.val < key) {
            return searchForKey(root.right, key);
        }

        if (root.val < key) {
            return searchForKey(root.left, key);
        }

        return null;
    }

    public static void main(String[] args) {
        Searchkey tree = new Searchkey();
        tree.insert(3);
        tree.insert(1);
        tree.insert(9);
        tree.insert(6);

        TreeNode check = tree.searchForKey(tree.root, 9);
        if (check != null) {
            System.out.print("Found: " + check.val);
        } else {
            System.out.print("NOT FOUND");
        }
    }
}
