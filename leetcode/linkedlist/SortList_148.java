package linkedlist;

/**
 * SortList_148
 */
public class SortList_148 {
  public ListNode sortList(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    ListNode slow = head;
    ListNode fast = head;
    ListNode mid = null;
    while (fast != null && fast.next != null) {
      mid = slow;
      slow = slow.next;
      fast = fast.next.next;
    }
    mid.next = null;
    return helper(sortList(head), sortList(slow));
  }

  static ListNode helper(ListNode list1, ListNode list2) {
    if (list1 == null) {
      return list2;
    }
    if (list2 == null) {
      return list1;
    }
    if (list1.val < list2.val) {
      list1.next = helper(list1.next, list2);
      return list1;
    } else {
      list2.next = helper(list1, list2.next);
      return list2;
    }
  }
}
