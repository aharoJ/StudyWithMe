package intervals;

/**
 * L1.........R1
 * ------------L2........R2
 */
public class NonOverlappingIntervals_435 {
  private int count = 0;

  public int eraseOverlapIntervals(int[][] intervals) {
    Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
    int l1 = intervals[0][0];
    int r1 = intervals[0][1];
    for (int i = 1; i < intervals.length; ++i) {
      int l2 = intervals[i][0];
      int r2 = intervals[i][1];

      if (l2 < r1) {
        count++;
      } else {
        r1 = r2;
      }
    }
    return count;

  }
}
