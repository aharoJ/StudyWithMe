package heap;

import java.util.PriorityQueue;

/**
 * KthLargestElementStream_703
 */
public class KthLargestElementStream_703 {
  PriorityQueue<Integer> minheap = new PriorityQueue<>();
  private int k = 0;

  public KthLargestElementStream_703(int k, int[] nums) {
    this.k = k;
    for (int vals : nums) {
      add(vals);
    }
  }

  public int add(int val) {
    minheap.offer(val);
    if (minheap.size() > k) {
      minheap.poll();
    }
    return minheap.peek();
  }
}
