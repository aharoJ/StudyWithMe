package LinkedList.DoublyLinkedList;

import java.util.NoSuchElementException;

public class LinkedList {
  public ListNode head;
  public ListNode tail;
  public int length;

  public LinkedList() {
    this.head = null;
    this.tail = null;
    this.length = 0;
  }

  public boolean isEmpty() {
    return length == 0;
  }

  public int length() {
    return length;
  }

  public void displayForward() {
    if (head == null) {
      return;
    }

    ListNode current = head;
    while (current != null) {
      System.out.print(current.data + "-->");
      current = current.next;
    }
    System.out.print("NULL");
  }

  public void displayBackwards() {
    if (tail == null) {
      return;
    }
    ListNode current = tail;
    while (current != null) {
      System.out.print(current.data + "-->");
      current = current.previous;
    }
    System.out.print("NULL");
  }

  public void insertAtStart(int value) {
    ListNode node = new ListNode(value);
    if (head == null) { // List is empty
      head = node;
      tail = node;
    } else {
      node.next = head; // Point new node's next to the current head
      head.previous = node; // Point current head's prev to the new node
      head = node; // Update head to be the new node
    }
    length++; // Increment the length
  }

  public void insertAtEnd(int value) {
    ListNode node = new ListNode(value);
    if (tail == null) { // List is empty
      head = node;
      tail = node;
    } else {
      tail.next = node; // Point current tail's next to the new node
      node.previous = tail; // Point new node's prev to the current tail
      tail = node; // Update tail to be the new node
    }
    length++; // Increment the length
  }

  public ListNode deleteAtStart() {
    if (head == null) { // If the list is empty, there's nothing to delete
      return null;
    }

    ListNode remove_node = head; // Save the current head so we can return it later
    if (head == tail) { // If the list had only one node, then update the tail as well
      tail = null;
      head = null;
    } else {
      head = head.next; // Move the head to the next node
      head.previous = null; // Otherwise, disconnect the new head from the old head
    }
    remove_node.next = null; // Clear the next pointer of the removed node
    length--;

    return remove_node;
  }

  public ListNode deleteAtEnd() {
    if (tail == null) { // If the list is empty, there's nothing to delete
      return null;
    }

    ListNode removeNode = tail; // Save the current tail so we can return it later

    if (head == tail) { // If the list had only one node, then update both head and tail to null
      head = null;
    } else {
      tail = tail.previous; // Move the tail to the previous node
      tail.next = null; // Disconnect the new tail from the removed node
    }

    removeNode.previous = null; // Clear the prev pointer of the removed node to fully isolate it
    length--; // Assuming you maintain a length variable to track the size of the list

    return removeNode;
  }

  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.insertAtEnd(1);
    list.insertAtEnd(2);
    list.insertAtEnd(3);
    list.insertAtEnd(4);
    list.insertAtEnd(5);
    // list.insertAtStart(1);
    // list.insertAtStart(2);
    // list.insertAtStart(3);

    // list.displayForward();

    list.deleteAtStart();
    list.deleteAtEnd();
    list.displayForward();
  }
}
