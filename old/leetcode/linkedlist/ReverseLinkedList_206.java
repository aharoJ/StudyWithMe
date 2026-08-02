package linkedlist;

/**
 * ReverseLinkedList_206
 */
public class ReverseLinkedList_206 {
  public ListNode reverseList(ListNode head) {
    ListNode current = head;
    ListNode prev = null;
    while (current != null) {
      ListNode temp = current.next;
      current.next = prev;
      prev = current;
      current = temp;
    }
    return prev;
  }

  // -----------------------------------------------------------------------------
  private ListNode tail;

  public ListNode reverseListRecursively(ListNode head) {
    if (head == null || head.next == null) {
      tail = head; // Set the tail to the last node when we hit the end
      return head; // Return the new head (the last node)
    }

    // Recursively reverse the rest of the list
    ListNode newHead = reverseListRecursively(head.next);

    // Reverse the current node's pointer
    tail.next = head; // Tail's next should point to the current node
    tail = head; // Move the tail to the current node (move one step back)
    tail.next = null; // Set the current node's next to null (because it becomes the tail)

    return newHead; // Return the new head of the reversed list
  }
}
