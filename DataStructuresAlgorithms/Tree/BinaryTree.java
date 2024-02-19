package Tree;

import java.util.Stack;

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


    public void preOrder_Recursive(TreeNode root)
    {
        if (root==null){ return; }
        System.out.println("root: " + root.data);
        preOrder_Recursive(root.left);
        preOrder_Recursive(root.right);
    }

    // Iterative Version
    public void preOrder_Iterative()
    {
        if (root==null){ return; }

        Stack<TreeNode> stack= new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) 
        {
            TreeNode temp= stack.pop();
            System.out.print(temp.data + " ");
            
            if (temp.right !=null){
                stack.push(temp.right);
            }

            if (temp.left !=null){
                stack.push(temp.left);
            }
            
        }
    }
    
    
    public void inOrder_Recursive(TreeNode root)
    {
        if (root==null) { return; }

        inOrder_Recursive(root.left);
        System.out.println(root.data + " ");
        
        inOrder_Recursive(root.right);
    }

    public void inOrder_Iterative( TreeNode root)
    {
        if (root==null){ return; }

        Stack<TreeNode> stack= new Stack<>();
        TreeNode current= root;
        while(!stack.isEmpty() || current!=null)
        {
            if (current!=null ) {
                stack.push(current);
                current= current.left;
            // } else if (current.right!=null) {
            //     stack.push(current.right);
            } else {
                current= stack.pop();
                System.out.println(current.data);
                current= current.right;
            }
        }
    }


    public static void main(String[] args)
    {
        BinaryTree binary_tree= new BinaryTree();
        binary_tree.createBinaryTree();
        // binary_tree.preOrder_Iterative();
        // binary_tree.inOrder_Recursive(binary_tree.root);
        binary_tree.inOrder_Iterative(binary_tree.root);
    }
}
