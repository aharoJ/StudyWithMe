package intervals;

import java.util.Arrays;

/**
 * Input: points = [[10,16],[2,8],[1,6],[7,12]]
 * Output: 2
 *
 * Explanation: burst by 2 arrows:
 * - Shoot an arrow at x = 6, bursting the balloons [2,8] and [1,6].
 * - Shoot an arrow at x = 11, bursting the balloons [10,16] and [7,12].
 */
public class MinimumNumberArrowsBurstBalloons_452 {
  private int count = 1;

  public int findMinArrowShots(int[][] points) {
    Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1])); // for large int
    // Arrays.sort(points, (a, b) -> a[1] - b[1]);
    int currentHead = points[0][0]; // idle
    int currentTail = points[0][1];
    for (int i = 1; i < points.length; ++i) {
      int nextHead = points[i][0];
      int nextTail = points[i][1];

      if (currentTail < nextHead) {
        count++;
        currentHead = nextHead;
        currentTail = nextTail;
      }
    }
    return count;
  }
}
