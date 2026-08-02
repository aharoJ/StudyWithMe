package heap;

import java.util.PriorityQueue;

/**
 * LastStoneWeight_1046
 */
public class LastStoneWeight_1046 {
  public int lastStoneWeight(int[] stones) {
    PriorityQueue<Integer> pq = new PriorityQueue<>(
        (a, b) -> b - a);
    for (int stone : stones) {
      pq.offer(stone);
    }

    while (pq.size() > 1) {
      int first = pq.poll();
      int second = pq.poll();
      pq.offer(first - second);
    }

    return pq.peek();
  }
}
