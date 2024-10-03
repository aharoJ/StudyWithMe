package intervals;

import java.util.ArrayList;
import java.util.List;

/**
 * InsertInterval_57
 */
public class InsertInterval_57 {
  public int[][] insert(int[][] intervals, int[] newInterval) {
    int i = 0;
    int n = intervals.length;
    List<int[]> result = new ArrayList<>();
    // before current
    while (i < n && intervals[i][1] < newInterval[0]) {
      result.add(intervals[i]);
      i++;
    }

    // overlap
    while (i < n && intervals[i][0] <= newInterval[1]) {
      newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
      newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
      i++;
    }
    result.add(newInterval);

    // add remainding
    while (i < n) {
      result.add(intervals[i]);
      i++;
    }
    return result.toArray(new int[result.size()][0]);
  }
}
