package linkedlist;

/**
 * DLL
 */
public class DLL {
  private Node head;
  private Node tail;
  private int size; // Add size to track the number of elements

  public DLL() {
    size = 0; // Initialize size to 0 in the constructor
  }

  public void insertFirst(int val) {
    Node node = new Node(val);
    node.next = head;
    node.prev = null;

    if (head != null) {
      head.prev = node;
    } else {
      tail = node; // If list is empty, tail should also point to the new node
    }
    head = node;
    size++; // Increment size when a node is added
  }

  public void display() {
    Node node = head;
    Node last = null;
    while (node != null) {
      System.out.print(node.value + "--> ");
      last = node;
      node = node.next;
    }
    System.out.println("END");

    System.out.println("print in reverse");
    while (last != null) {
      System.out.print(last.value + "--> ");
      last = last.prev;
    }
    System.out.println("START");
  }

  public void insertLast(int val) {
    Node node = new Node(val);
    // If the list is empty, initialize both head and tail to the new node
    if (head == null) {
      head = node;
      tail = node;
      node.prev = null; // Head has no previous node
      node.next = null; // Tail has no next node
    } else {
      tail.next = node;
      node.prev = tail;
      tail = node;
      node.next = null;
    }
    size++; // Increment size when a node is added
  }

  public void insert(int val, int index) {
    // Insert at the beginning if index is 0
    if (index == 0) {
      insertFirst(val);
      return;
    }

    // Insert at the end if index is equal to the size of the list
    if (index == size) { // Use size instead of size()
      insertLast(val);
      return;
    }

    Node node = new Node(val);

    // Traverse to the node just before the target index
    Node prev_node = head;
    for (int i = 1; i < index; i++) {
      prev_node = prev_node.next;
    }

    // Adjust pointers to insert the new node between prev_node and prev_node.next
    node.next = prev_node.next;
    node.prev = prev_node;

    if (prev_node.next != null) {
      prev_node.next.prev = node;
    }

    prev_node.next = node;
    size++; // Increment size when a node is added
  }

  public void insertAfter(int after_value, int val) {
    // Traverse the list to find the node with the value after_value
    Node current = head;

    while (current != null && current.value != after_value) {
      current = current.next;
    }

    // If the node with the given value is not found, do nothing
    if (current == null) {
      System.out.println("Node with value " + after_value + " not found.");
      return;
    }

    // Create a new node with the value 'val'
    Node node = new Node(val);

    // Adjust pointers to insert the new node after the current node
    node.next = current.next;
    node.prev = current;

    if (current.next != null) {
      current.next.prev = node;
    }

    current.next = node;

    // If we're inserting after the tail, update the tail
    if (current == tail) {
      tail = node;
    }

    // Increment size (if you're tracking the size of the list)
    size++;
  }

  // Method to return the size of the list
  public int size() {
    return size;
  }

  private class Node {
    private int value;
    private Node next;
    private Node prev;

    public Node(int value) {
      this.value = value;
    }

    @SuppressWarnings("unused")
    public Node(int value, Node next, Node prev) {
      this.value = value;
      this.next = next;
      this.prev = prev;
    }
  }
}
