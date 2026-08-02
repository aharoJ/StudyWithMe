package heap;

import java.util.PriorityQueue;

/**
 * KthSmallestElementSortedMatrix_378
 */
public class KthSmallestElementSortedMatrix_378 {
  public int kthSmallest(int[][] matrix, int k) {
    int n = matrix.length;
    PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);

    // Initialize the heap with the first element of each row
    for (int i = 0; i < n; i++) {
      minHeap.offer(new int[] { matrix[i][0], i, 0 });
    }

    // Extract the smallest elements k-1 times
    while (k > 1) {
      int[] current = minHeap.poll();
      int row = current[1];
      int col = current[2];

      if (col + 1 < n) {
        minHeap.offer(new int[] { matrix[row][col + 1], row, col + 1 });
      }
      k--;
    }

    // heap is the kth smallest element
    return minHeap.poll()[0];
  }
}
