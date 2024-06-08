package Tree_New;

public class SearchKey extends Tree {

    public TreeNode searchForKey(int key) {
        return searchForKeyRec(root, key);
    }

    private TreeNode searchForKeyRec(TreeNode node, int key) {
        if (node == null || node.val == key) {
            return node;
        }
        if (key < node.val) {
            return searchForKeyRec(node.left, key);
        } else {
            return searchForKeyRec(node.right, key);
        }
    }
}
