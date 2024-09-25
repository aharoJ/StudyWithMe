package linkedlist;

/**
 * Move pointers at different speeds: The slow pointer moves one step at a time,
 * and the fast pointer moves two steps at a time.
 *
 * End Condition: The fast pointer will eventually reach the end of the list (or
 * become null). When that happens, the slow pointer will be exactly in the
 * middle of the list.
 */
public class MiddleLinkedList_876 {
  public ListNode middleNode(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }
}
