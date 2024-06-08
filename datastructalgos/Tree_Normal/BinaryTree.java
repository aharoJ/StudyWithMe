package Tree_Normal;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
    public TreeNode root;

    public void createBinaryTree() {
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
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

    public void preOrder_Recursive(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println("root: " + root.data);
        preOrder_Recursive(root.left);
        preOrder_Recursive(root.right);
    }

    // Iterative Version
    public void preOrder_Iterative() {
        if (root == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            System.out.print(temp.data + " ");

            if (temp.right != null) {
                stack.push(temp.right);
            }

            if (temp.left != null) {
                stack.push(temp.left);
            }

        }
    }

    public void inOrder_Recursive(TreeNode root) {
        if (root == null) {
            return;
        }

        inOrder_Recursive(root.left);
        System.out.println(root.data + " ");

        inOrder_Recursive(root.right);
    }

    public void inOrder_Iterative(TreeNode root) {
        if (root == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while (!stack.isEmpty() || current != null) {
            if (current != null) {
                stack.push(current);
                current = current.left;
                // } else if (current.right!=null) {
                // stack.push(current.right);
            } else {
                current = stack.pop();
                System.out.println(current.data);
                current = current.right;
            }
        }
    }

    public void postOrder_Recursive(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder_Recursive(root.left);
        postOrder_Recursive(root.right);
        System.out.print(root.data + " ");
    }

    public void postOrder_Iterative(TreeNode root) {
        TreeNode current = root;
        Stack<TreeNode> stack = new Stack<>();
        while (current != null || !stack.isEmpty()) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                TreeNode temp = stack.peek().right;
                if (temp == null) {
                    temp = stack.pop();
                    System.out.print(temp.data + " ");
                    while (!stack.isEmpty() && temp == stack.peek().right) {
                        temp = stack.pop();
                        System.out.print(temp.data + " ");
                    }
                } else {
                    current = temp;
                }
            }
        }
    }

    // Dinesh called it postOrder <--> BFS: level order traversal of a binary
    // This is a BFS: level order traversal of a binary tree
    public void levelOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            System.out.print(temp.data + " ");
            if (temp.left != null) {
                queue.add(temp.left);
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }
        }
    }

    public static void main(String[] args) {
        BinaryTree binary_tree = new BinaryTree();
        binary_tree.createBinaryTree();
        // binary_tree.preOrder_Iterative();
        // binary_tree.inOrder_Recursive(binary_tree.root);
        // binary_tree.inOrder_Iterative(binary_tree.root);

        // binary_tree.postOrder_Recursive(binary_tree.root);
        binary_tree.levelOrderTraversal(binary_tree.root);
    }
}
