package intervals;

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
 */
@SuppressWarnings("unused") // Nvim
class Solution {
  public int[][] merge(int[][] intervals) {
    int i = 0, n = intervals.length;
    List<int[]> result = new ArrayList<>();
    while (i < n) {
      // no overlap
      if (intervals[i][1] < intervals[i + 1][0]) {
        result.add(intervals[i]);
        i++;
      }

      // overlap
      if (intervals[i][0] < intervals[i + 1][1]) {
        intervals[0] = Math.min(intervals[i][0], intervals[i + 1][0]);
        intervals[1] = Math.min(intervals[i][1], intervals[i + 1][1]);
        ++i;
      }
      result.add(intervals[i]);

      // fill rest
      if (i < n) {
        result.add(intervals[i]);
      }
    }
    return result.toArray(new int[result.size()][0]);
  }
}
