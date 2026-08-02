package linkedlist;

/**
 * LinkedListCycleII_142
 */
public class LinkedListCycleII_142 {
  // Find the starting point of the cycle
  public ListNode detectCycle(ListNode head) {
    if (head == null || head.next == null) {
      return null; // No cycle if the list is empty or has only one node
    }

    ListNode slow = head;
    ListNode fast = head;

    // Detect cycle using Floyd's Tortoise and Hare algorithm
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;

      // Cycle detected
      if (slow == fast) {
        // Step 2: Find the start of the cycle
        ListNode pointer = head;
        while (pointer != slow) {
          pointer = pointer.next;
          slow = slow.next;
        }
        return pointer; // The start of the cycle
      }
    }
    return null; // No cycle found
  }
}
