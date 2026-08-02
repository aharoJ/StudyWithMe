package heap;

import java.util.PriorityQueue;

/**
 * MaximumProductTwoElementsArray_1464
 */
public class MaximumProductTwoElementsArray_1464 {
  public int maxProduct(int[] nums) {
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

    for (int num : nums) {
      maxHeap.add(num);
    }

    // Extract the two largest elements
    int first = maxHeap.poll(); // Largest element
    int second = maxHeap.poll(); // Second largest element

    // Calculate the product
    return (first - 1) * (second - 1);
  }
}
