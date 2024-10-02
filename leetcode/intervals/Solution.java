package intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 */
@SuppressWarnings("unused") // Nvim
class Solution {
  public boolean canAttendMeetings(int[][] intervals) {
    Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
    for (int i = 1; i < intervals.length - 1; i++) {
      // Meeting A (previous meeting)
      int startA = intervals[i][0];
      int endA = intervals[i][1];

      // Meeting B (current meeting)
      int startB = intervals[i + 1][0];
      int endB = intervals[i + 1][1];

      // Check if Meeting B overlaps with Meeting A
      if (startB < endA) {
        return false; // There's an overlap, can't attend all meetings
      }
    }

    // If no overlaps found, return true
    return true;
  }
}
