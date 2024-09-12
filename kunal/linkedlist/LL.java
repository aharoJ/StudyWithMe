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
    for (int i = 0; i < index - 1; ++i) {
      temp = temp.next; // Traverse to the node just before the insertion point
    }
    Node node = new Node(val, temp.next); // Insert new node
    temp.next = node; // Link the new node
    size++;
  }

  public int deleteFirst() {
    int val = head.value;
    head = head.next;
    if (head == null) {
      tail = null;
    }
    size--;
    return val;
  }

  public Node get(int index) {
    if (head == null) {
      return null;
    }
    Node node = head;
    for (int i = 0; i < index; ++i) {
      node = node.next;
    }
    return node;
  }

  public int deleteLast() {
    if (size <= 1) {
      return deleteFirst();
    }
    Node secondLast = get(size - 2);
    int val = tail.value; // Get the value of the tail before deletion
    tail = secondLast; // Update tail to second last
    tail.next = null; // Remove the last node by setting next to null
    size--;

    return val;
  }

  public int delete(int index) {
    if (index == 0) {
      return deleteFirst();
    }
    if (index == size - 1) {
      return deleteLast();
    }

    Node prev = get(index - 1); // Get the node before the one to be deleted
    int val = prev.next.value; // Get the value of the node to be deleted

    prev.next = prev.next.next; // Skip the node being deleted

    size--;
    return val;
  }

  public Node findVal(int val) {
    if (head == null) {
      return null;
    }
    Node node = head;
    while (node != null) {
      if (node.value == val) {
        return node;
      }
      node = node.next;
    }
    return null;
  }

  // ------------------------------------------------------------------------------------------------------
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
