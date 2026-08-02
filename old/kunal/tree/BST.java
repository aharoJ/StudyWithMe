package tree;

/**
 * BST
 */
public class BST {
  private class Node {
    private int value;
    private int height;
    Node left;
    Node right;

    public Node(int value) {
      this.value = value;
    }

    public int getValue() {
      return value;
    }
  }

  private Node root;

  public BST() {
  }

  public int height(Node node) {
    if (node == null) {
      return -1;
    }

    return node.height;
  }

  public boolean isEmpty() {
    if (root == null) {
      return true;
    }
    return false;
  }

  public void insert(int value) {
    root = insert(value, root);
  }

  private Node insert(int val, Node node) {
    if (node == null) {
      node = new Node(val);
      return node;
    }
    if (val < node.value) {
      node.left = insert(val, node.left);
    } else {
      node.right = insert(val, node.right);
    }
    node.height = Math.max(height(node.left), height(node.right)) + 1;
    return node;
  }

  public void populate(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      this.insert(nums[i]);
    }
  }

  public void populateSorted(int[] nums) {
    populateSorted(nums, 0, nums.length);
  }

  private void populateSorted(int[] nums, int left, int right) {
    if (left >= right) {
      return;
    }
    int mid = left + (right - left) / 2;
    this.insert(nums[mid]);
    populateSorted(nums, left, mid);
    populateSorted(nums, mid + 1, right);
  }

  public boolean isBalanced() {
    return isBalanced(root);
  }

  private boolean isBalanced(Node node) {
    if (node == null) {
      return true;
    }
    return Math.abs(height(node.left) - height(node.right)) <= 1
        && isBalanced(node.left) && isBalanced(node.right);
  }

  public void display() {
    display(root, "Root Node: ");
  }

  private void display(Node node, String details) {
    if (node == null) {
      return;
    }
    System.out.println(details + node.getValue());
    display(node.left, "Left child of " + node.value + " : ");
    display(node.right, "Right child of " + node.value + " : ");

  }

}
