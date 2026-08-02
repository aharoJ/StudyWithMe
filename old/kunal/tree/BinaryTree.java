package tree;

import java.util.Scanner;

/**
 * BinaryTree
 */
public class BinaryTree {
  private static class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
      this.value = value;
    }
  }

  private Node root;

  public void populate(Scanner scanner) {
    System.out.println("Enter the root value: ");
    int root_val = scanner.nextInt();
    root = new Node(root_val); // Initialize the root node here
    populate(scanner, root);
  }

  private void populate(Scanner scanner, Node node) {
    System.out.println("Do you want to enter left of " + node.value + "?");
    boolean left = scanner.nextBoolean();
    if (left) {
      System.out.println("Enter the value of the left node of " + node.value + ":");
      int in_value = scanner.nextInt();
      node.left = new Node(in_value);
      populate(scanner, node.left);
    }

    System.out.println("Do you want to enter right of " + node.value + "?");
    boolean right = scanner.nextBoolean();
    if (right) {
      System.out.println("Enter the value of the right node of " + node.value + ":");
      int in_value = scanner.nextInt();
      node.right = new Node(in_value);
      populate(scanner, node.right);
    }
  }

  public void display() {
    display(root, "");
  }

  private void display(Node node, String indent) {
    if (node == null) {
      return;
    }

    System.out.println(indent + node.value); // Print node's value
    display(node.left, indent + "\t");
    display(node.right, indent + "\t");
  }

  public void displayPretty() {
    displayPretty(root, 0);
  }

  private void displayPretty(Node node, int level) {
    if (node == null) {
      return;
    }
    displayPretty(node.right, level + 1);
    if (level != 0) {
      for (int i = 0; i < level - 1; ++i) {
        System.out.print("|\t\t");
      }
      System.out.println("|---------------->" + node.value);
    } else {
      System.out.println(node.value);
    }
    displayPretty(node.left, level + 1);
  }

  public void preOrder() {
    preOrder(root);
  }

  private void preOrder(Node node) {
    if (node == null) {
      return;
    }
    System.out.println(node.value + " ");
    preOrder(node.left);
    preOrder(node.right);
  }

  public void inOrder() {
    inOrder(root);
  }

  private void inOrder(Node node) {
    if (node == null) {
      return;
    }
    inOrder(node.left);
    System.out.println(node.value + " ");
    inOrder(node.right);
  }

  public void postOrder() {
    postOrder(root);
  }

  private void postOrder(Node node) {
    if (node == null) {
      return;
    }
    postOrder(node.left);
    postOrder(node.right);
    System.out.println(node.value + " ");
  }

}
