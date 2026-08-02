package heap;

import java.util.PriorityQueue;

/**
 * RelativeRanks_506
 */
public class RelativeRanks_506 {
  public String[] findRelativeRanks(int[] score) {
    String[] result = new String[score.length];
    PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
        (a, b) -> b[0] - a[0]);
    for (int i = 0; i < score.length; i++) {
      maxHeap.offer(new int[] { score[i], i }); // score and its original index
    }

    // Assign medals or rankings while polling the heap
    int rank = 1;
    while (!maxHeap.isEmpty()) {
      int[] top = maxHeap.poll();
      int index = top[1]; // original index

      if (rank == 1) {
        result[index] = "Gold Medal";
      } else if (rank == 2) {
        result[index] = "Silver Medal";
      } else if (rank == 3) {
        result[index] = "Bronze Medal";
      } else {
        result[index] = String.valueOf(rank);
      }
      rank++;
    }
    return result;
  }
}
