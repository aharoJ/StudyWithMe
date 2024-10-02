package linkedlist;

/**
 * ReorderList_143
 */
public class ReorderList_143 {
  private ListNode reverseList(ListNode head) {
    ListNode prev = null;
    while (head != null) {
      ListNode next = head.next;
      head.next = prev;
      prev = head;
      head = next;
    }
    return prev;
  }

  private ListNode middleNode(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

  public void reorderList(ListNode head) {
    if (head == null || head.next == null) {
      return;
    }
    ListNode mid = middleNode(head);
    ListNode head_second = reverseList(mid);
    ListNode head_first = head;

    // rearrange
    while (head_first != null && head_second != null) {
      ListNode temp = head_first.next;
      head_first.next = head_second;
      head_first = temp;

      temp = head_second.next;
      head_second.next = head_first;
      head_second = temp;
    }

    // next of tail to null
    if (head_first != null) {
      head_first.next = null;
    }
  }
}
