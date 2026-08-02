package linkedlist;

/**
 * RotateList_61
 */
public class RotateList_61 {
  public ListNode rotateRight(ListNode head, int k) {
    if (k == 0 || head == null) {
      return head;
    }

    ListNode last = head;
    int length = 1;
    while (last.next != null) {
      last = last.next;
      length++;
    }

    last.next = head;
    int rotations = k % length;
    int skip = length - rotations;
    ListNode new_last = head;
    for (int i = 0; i < skip - 1; ++i) {
      new_last = new_last.next;
    }
    head = new_last.next;
    new_last.next = null;

    return head;
  }
}
