package heap;

import java.util.PriorityQueue;

/**
 * int[][]result=new int[3][2];
 *
 * result = [
 * [0, 0], // Point 1 (x1, y1)
 * [0, 0], // Point 2 (x2, y2)
 * [0, 0] // Point 3 (x3, y3)
 * ]
 */
public class KClosestPointsOrigin_973 {
  public int[][] kClosest(int[][] points, int k) {
    PriorityQueue<int[]> pq = new PriorityQueue<>(
        (a, b) -> distance(b) - distance(a));
    for (int[] point : points) {
      pq.offer(point);
      if (pq.size() > k) {
        pq.poll();
      }
    }

    int[][] result = new int[k][2];
    for (int i = 0; i < k; ++i) {
      result[i] = pq.poll();
    }
    return result;
  }

  private int distance(int[] point) {
    return point[0] * point[0] + point[1] * point[1];
  }
}
