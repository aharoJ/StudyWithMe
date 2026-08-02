package linkedlist;

/**
 * Input: head = [1,1,2,3,3]
 * Output: [1,2,3]
 */
public class RemoveDuplicatesSortedList_83 {
  public ListNode deleteDuplicates(ListNode head) {
    if (head == null) {
      return head;
    }
    ListNode node = head;
    while (node.next != null) {
      if (node.val == node.next.val) {
        node.next = node.next.next;
      } else {
        node = node.next;
      }
    }
    return head;
  }
}
