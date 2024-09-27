package heap;

import java.util.PriorityQueue;

/**
 * explanation: https://www.youtube.com/watch?v=ZmGk7h8KZLs&ab_channel=GregHogg
 */
public class KthLargestElementArray_215 {
  public int findKthLargest(int[] nums, int k) {
    return -1;
    // SELECT ONE OF THE METHODS BELOW
  }

  // -----------------------------------------------------------------------------------------------
  public int maxHeap(int[] nums, int k) {
    PriorityQueue<Integer> maxheap = new PriorityQueue<>(
        (a, b) -> b - a);
    for (int num : nums) {
      maxheap.offer(num);
    }

    // Remove the top k-1 elements to get to the kth largest element
    for (int i = 0; i < k - 1; i++) {
      maxheap.poll();
    }
    return maxheap.peek();
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
