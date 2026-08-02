package heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * TopKFrequentElements_347
 */
public class TopKFrequentElements_347 {
  public int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int num : nums) {
      int freq = map.getOrDefault(num, 0);
      map.put(num, freq + 1);
    }

    PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
        (a, b) -> a.getValue() - b.getValue());

    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      minHeap.offer(entry);
      if (minHeap.size() > k) {
        minHeap.poll();
      }
    }

    int[] result = new int[k];
    for (int i = 0; i < k; ++i) {
      result[i] = minHeap.poll().getKey();
    }

    return result;
  }
}
