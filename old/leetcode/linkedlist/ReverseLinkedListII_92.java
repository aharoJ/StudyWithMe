package linkedlist;

/**
 * why reverse:
 * For example, if the list is [1, 2, 3, 2, 1], the first half [1, 2, 3] needs
 * to be compared to the reverse of the second half [3, 2, 1].
 */
public class ReverseLinkedListII_92 {
  public ListNode reverseBetween(ListNode head, int left, int right) {
    if (left == right) {
      return head;
    }

    ListNode currentNode = head;
    ListNode previousNode = null;

    // Move to the node at position `left`
    for (int i = 0; currentNode != null && i < left - 1; ++i) {
      previousNode = currentNode;
      currentNode = currentNode.next;
    }

    ListNode nodeBeforeLeft = previousNode; // Node just before the `left` position
    ListNode leftNode = currentNode; // Node at the `left` position

    // Reverse the nodes between `left` and `right`
    for (int i = 0; currentNode != null && i < right - left + 1; ++i) {
      ListNode nextNode = currentNode.next;
      currentNode.next = previousNode;
      previousNode = currentNode;
      currentNode = nextNode;
    }

    // Connect the reversed part with the rest of the list
    if (nodeBeforeLeft != null) {
      nodeBeforeLeft.next = previousNode;
    } else {
      head = previousNode; // If reversing starts from the first node, update the head
    }

    // Connect the end of the reversed part with the rest of the list
    leftNode.next = currentNode;

    return head;
  }
}
