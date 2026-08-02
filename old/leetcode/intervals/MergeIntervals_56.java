package intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * L1.........R1
 * L2.............R2
 */
class Solution {
  public int[][] merge(int[][] intervals) {
    Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
    List<int[]> result = new ArrayList<>();
    int currentHead = intervals[0][0];
    int currentTail = intervals[0][1];
    for (int i = 1; i < intervals.length; i++) {
      int nextHead = intervals[i][0];
      int nextTail = intervals[i][1];

      if (currentTail >= nextHead) { // Overlapping condition
        currentTail = Math.max(currentTail, nextTail);
      } else {
        result.add(new int[] { currentHead, currentTail });
        currentHead = nextHead; // here
        currentTail = nextTail; // here
      }
    }
    // Add the last interval (currentHead, currentTail)
    result.add(new int[] { currentHead, currentTail });

    return result.toArray(new int[result.size()][]);
  }
}
