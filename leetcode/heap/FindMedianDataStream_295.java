package heap;

import java.util.PriorityQueue;

/**
 * If the max-heap has more elements, the median is the root of the max-heap.
 * If both heaps are balanced, the median is the average of the roots of the two
 * heaps.*
 */
public class FindMedianDataStream_295 {
  private PriorityQueue<Integer> minheap;
  private PriorityQueue<Integer> maxheap;

  public FindMedianDataStream_295() {
    minheap = new PriorityQueue<>((a, b) -> a - b);
    maxheap = new PriorityQueue<>((a, b) -> b - a);
  }

  public void addNum(int num) {
    maxheap.offer(num);
    minheap.offer(maxheap.poll());

    if (maxheap.size() < minheap.size()) {
      maxheap.offer(minheap.poll());
    }
  }

  public double findMedian() {
    if (maxheap.size() > minheap.size()) {
      return maxheap.peek(); // not balanced
    } else {
      return (maxheap.peek() + minheap.peek()) / 2.0; // balanced
    }
  }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
