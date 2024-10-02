package heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * FindKPairsSmallestSums_373
 */
public class FindKPairsSmallestSums_373 {
  public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
    List<int[]> result = new ArrayList<>();
    if (nums1.length == 0 || nums2.length == 0 || k == 0) {
      return result;
    }

    PriorityQueue<int[]> minHeap = new PriorityQueue<>(
        (a, b) -> (a[0] + a[1]) - (b[0] + b[1]));

    // Initialize the heap with the first element from nums1 paired with all
    // elements of nums2
    for (int i = 0; i < nums1.length && i < k; i++) {
      minHeap.offer(new int[] { nums1[i], nums2[0], 0 });
    }

    // Extract the k smallest pairs
    while (k-- > 0 && !minHeap.isEmpty()) {
      int[] curr = minHeap.poll();
      result.add(new int[] { curr[0], curr[1] });

      // If there is any element left in nums2 for this current pair, push the next
      // element
      if (curr[2] < nums2.length - 1) {
        minHeap.offer(new int[] { curr[0], nums2[curr[2] + 1], curr[2] + 1 });
      }
    }

    return result;
  }
}
