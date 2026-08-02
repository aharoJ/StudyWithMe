package intervals;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

/**
 * head.......tail
 * L1.........R1
 * L2....R2
 * head..tail
 * Input: points = [[10,16],[2,8],[1,6],[7,12]]
 * Output: 2
 * Explanation: burst by 2 arrows:
 * - Shoot an arrow at x = 6, bursting the balloons [2,8] and [1,6].
 * - Shoot an arrow at x = 11, bursting the balloons [10,16] and [7,12].
 */
@SuppressWarnings("unused") // Nvim
class Solution {
  private int count = 0;

  public int findMinArrowShots(int[][] points) {
    Arrays.sort(points, (a, b) -> a[0] - b[0]);
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
