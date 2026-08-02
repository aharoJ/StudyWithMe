package tree;

import java.util.Scanner;

/**
 * TreeMain
 */
@SuppressWarnings("unused")
public class TreeMain {
  public static void main(String[] args) {
    // Scanner scanner = new Scanner(System.in);
    // BinaryTree tree = new BinaryTree();
    // tree.populate(scanner);
    // // tree.display();
    // tree.displayPretty();
    // ---------------Binary Tree ----------------------
    BST tree = new BST();
    int[] nums = { 5, 2, 7, 1, 4, 6, 9, 8, 3, 10 };
    tree.populate(nums);
    tree.display();

    // ---------------Binary SearchTree ----------------------
  }
}
