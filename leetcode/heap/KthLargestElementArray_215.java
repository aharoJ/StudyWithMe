package heap;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * explanation: https://www.youtube.com/watch?v=ZmGk7h8KZLs&ab_channel=GregHogg
 */
public class KthLargestElementArray_215 {
  public int findKthLargest(int[] nums, int k) {
    PriorityQueue<Integer> minheap = new PriorityQueue<>();
    for (int vals : nums) {
      minheap.offer(vals);

      if (minheap.size() > k) {
        minheap.poll();
      }
    }
    return minheap.peek();
  }

  // -----------------------------------------------------------------------------------------------
  public int maxHeap(int[] nums, int k) {
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    for (int num : nums) {
      maxHeap.offer(num);
    }

    // Remove the top k-1 elements to get to the kth largest element
    for (int i = 0; i < k - 1; i++) {
      maxHeap.poll();
    }
    return maxHeap.peek();
  }

  // -----------------------------------------------------------------------------------------------
  public int minHeap(int[] nums, int k) {
    PriorityQueue<Integer> minheap = new PriorityQueue<>();

    for (int vals : nums) {
      minheap.offer(vals);
      if (minheap.size() > k) {
        minheap.poll(); // Remove the smallest element
      }
    }
    return minheap.peek();
  }
}
