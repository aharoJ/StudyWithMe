package heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

import linkedlist.ListNode;

/**
 */
@SuppressWarnings("unused")
class Solution {
  public ListNode mergeKLists(ListNode[] lists) {
    Queue<ListNode> minheap = new PriorityQueue<>(
        (a, b) -> a.val - b.val);
    for (ListNode node : lists) {
      if (node != null) {
        minheap.offer(node);
      }
    }

    ListNode head = new ListNode(0);
    ListNode current = head;
    // Extract the smallest element from the heap, and add to the merged list
    while (!minheap.isEmpty()) {
      // Get the smallest node
      ListNode smallest = minheap.poll();
      // Add the smallest node to the merged list
      current.next = smallest;
      current = current.next;

      // If there is a next node in the list, add it to the heap
      if (smallest.next != null) {
        minheap.offer(smallest.next);
      }
    }

    // Return the merged list, which starts after the head node
    return head.next;
  }

}
