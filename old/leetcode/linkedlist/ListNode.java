package linkedlist;

/**
 * This is the ListNode class used across multiple LeetCode problems.
 * It is included here to avoid errors in the local environment when
 * working on the StudyGuide for FAANG interview prep.
 * 
 * NOTE: For LeetCode submissions, this class is already provided.
 */
public class ListNode {
  public int val;
  public ListNode next;

  // Head of the linked list (added this line to store reference to head)
  public ListNode head;

  // Default constructor
  public ListNode() {
  }

  // Constructor with value
  public ListNode(int val) {
    this.val = val;
  }

  // Constructor with value and next node
  public ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  // Insert last method with correct logic
  public void insertLast(int val) {
    ListNode node = new ListNode(val); // Create a new node with the value
    if (head == null) {
      head = node; // If the list is empty, set the new node as the head
      return; // Exit the method
    }

    ListNode current = head;
    // Traverse to the last node
    while (current.next != null) {
      current = current.next;
    }

    // Insert the new node at the end
    current.next = node;
  }

  public void printList(ListNode head) {
    ListNode current = head;
    while (current != null) {
      System.out.print(current.val + " ");
      current = current.next;
    }
    System.out.println();
  }

}
