package intervals;

import java.util.Arrays;

/**
 * Input: intervals = [[0,30],[5,10],[15,20]]
 * Output: false
 * 
 * Input: intervals = [[7,10],[2,4]]
 * Output: true
 */
public class MeetingRooms_252 {
  public boolean canAttendMeetings(int[][] intervals) {
    Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
    for (int i = 0; i < intervals.length - 1; i++) {
      // Current meeting (A)
      int startA = intervals[i][0];
      int endA = intervals[i][1];

      // Next meeting (B)
      int startB = intervals[i + 1][0];
      int endB = intervals[i + 1][1];

      // Check if the next meeting B starts before the current meeting A ends
      if (startB < endA) {
        return false; // There's an overlap
      }
    }
    return true; // no overlaps
  }
}
