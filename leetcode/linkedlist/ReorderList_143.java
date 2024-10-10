package linkedlist;

/**
 * Input: head = [1,2,3,4]
 * Output: [1,4,2,3]
 * 
 * Input: head = [1,2,3,4,5]
 * Output: [1,5,2,4,3]
 */
public class ReorderList_143 {
  class Solution {
    public void reorderList(ListNode head) {
      if (head == null || head.next == null) {
        return;
      }
      ListNode mid = getMiddle(head);

      ListNode secondHalf = reverse(mid.next);
      mid.next = null; // Break the list into two halves

      mergeAlternate(head, secondHalf);

    }

    private ListNode getMiddle(ListNode node) {
      ListNode slow = node;
      ListNode fast = node.next;
      while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
      }
      return slow;
    }

    private ListNode reverse(ListNode node) {
      ListNode prev = null;
      while (node != null) {
        ListNode temp = node.next;
        node.next = prev;
        prev = node;
        node = temp;
      }
      return prev;
    }

    private void mergeAlternate(ListNode list1, ListNode list2) {
      if (list1 == null || list2 == null) {
        return;
      }

      while (list1 != null && list2 != null) {
        ListNode temp = list1.next;
        list1.next = list2; // Point list1 to list2
        list1 = temp; // Move to the next node in list1

        temp = list2.next;
        list2.next = list1; // Point list2 to list1
        list2 = temp; // Move to the next node in list2
      }
    }
  }
}
