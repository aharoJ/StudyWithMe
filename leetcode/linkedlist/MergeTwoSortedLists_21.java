package linkedlist;

/**
 * Input: list1 = [1,2,4], list2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 * 
 * Input: list1 = [], list2 = []
 * Output: []
 * 
 * Input: list1 = [], list2 = [0]
 * Output: [0]
 */
class Solution {
  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    if (list1 == null) {
      return list2;
    }
    if (list2 == null) {
      return list1;
    }

    if (list1.val < list2.val) {
      // do this
      list1.next = mergeTwoLists(list1.next, list2);
      return list1;
    } else {
      // list2 is smaller
      list2.next = mergeTwoLists(list1, list2.next);
      return list2;
    }
  }
}
