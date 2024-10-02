package linkedlist;

/**
 * ReverseNodeskinGroup_25
 */
public class ReverseNodeskinGroup_25 {
  // Get the length of the list
  public int getLength(ListNode head) {
    ListNode node = head;
    int length = 0;
    while (node != null) {
      length++;
      node = node.next;
    }
    return length;
  }

  // Reverse nodes in k groups
  public ListNode reverseKGroup(ListNode head, int k) {
    if (k <= 1 || head == null) {
      return head; // No need to reverse if k <= 1
    }

    int length = getLength(head); // Get the total length of the list
    int count = length / k; // Determine how many full groups of k can be reversed

    ListNode currentNode = head;
    ListNode previousNode = null; // Tracks the end of the reversed portion

    while (count > 0) {
      // These two pointers help with reconnecting the reversed groups later
      ListNode nodeBeforeLeft = previousNode;
      ListNode leftNode = currentNode;

      // Reverse k nodes
      ListNode nextNode = currentNode.next;
      for (int i = 0; currentNode != null && i < k; ++i) {
        currentNode.next = previousNode;
        previousNode = currentNode;
        currentNode = nextNode;
        if (nextNode != null) {
          nextNode = nextNode.next;
        }
      }

      // Connect the reversed portion with the previous part of the list
      if (nodeBeforeLeft != null) {
        nodeBeforeLeft.next = previousNode;
      } else {
        head = previousNode; // If we're at the first group, update the head
      }

      // Connect the end of the reversed group to the remaining list
      leftNode.next = currentNode;

      if (currentNode == null) {
        break; // If we've reached the end of the list, stop
      }

      // Move previousNode to the end of the reversed group (leftNode)
      previousNode = leftNode;
      count--; // Decrease the number of remaining full groups to reverse
    }
    return head
  }
}
