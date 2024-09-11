package linkedlist;

public class LL {
  private Node head;
  private Node tail;
  private int size;

  public LL() {
    this.size = 0;
  }

  public void insertFirst(int val) {
    Node node = new Node(val);
    node.next = head;
    head = node;

    if (tail == null) {
      tail = head;
    }
    size++;
  }

  public void display() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.value + " -> ");
      temp = temp.next;
    }
    System.out.println("NULL");
  }

  public void insertLast(int val) {
    if (tail == null) {
      insertFirst(val);
      return;
    }
    Node node = new Node(val);
    tail.next = node;
    tail = node; // Set the tail to the newly added node
    size++;
  }

  public void insert(int val, int index) {
    if (index == 0) {
      insertFirst(val);
      return;
    }
    if (index == size) {
      insertLast(val);
      return;
    }

    Node temp = head;
    for (int i = 0; i < index-1; ++i) {
      temp = temp.next; // Traverse to the node just before the insertion point
    }
    Node node = new Node(val, temp.next); // Insert new node
    temp.next = node; // Link the new node
    size++;
  }

  // Private Node class
  private class Node {
    private int value;
    private Node next;

    public Node(int value, Node next) {
      this.value = value;
      this.next = next;
    }

    public Node(int value) {
      this.value = value;
    }
  }

}
