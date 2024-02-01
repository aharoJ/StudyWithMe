package Graphs;

public class BinaryTree 
{
    private TreeNode root;

    public void createBinaryTree()
    {
        TreeNode first= new TreeNode(9);
        TreeNode second= new TreeNode(2);
        TreeNode third= new TreeNode(3);
        TreeNode fourth= new TreeNode(4);

        root= first;
        first.left= second;
        first.right= third;

        second.left= fourth;
    }


    public void preOrder(TreeNode root)
    {
        if (root==null){ return; }
        System.out.println("root: " + root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args)
    {
        BinaryTree binary_tree= new BinaryTree();
        binary_tree.createBinaryTree();
        binary_tree.preOrder(binary_tree.root);
        
    }
    
}
