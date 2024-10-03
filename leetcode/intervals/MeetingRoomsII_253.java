package intervals;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Input: intervals = [[0,30],[5,10],[15,20]]
 * Output: 2
 * 
 * Input: intervals = [[7,10],[2,4]]
 * Output: 1
 */
public class MeetingRoomsII_253 {
  public int minMeetingRooms(int[][] intervals) {
    Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
    Queue<Integer> minheap = new PriorityQueue<>(
        (a, b) -> a - b);
    minheap.offer(intervals[0][1]); // offer 1st interval
    for (int i = 0; i < intervals.length - 1; ++i) {
      int startA = intervals[i][0];
      int endA = intervals[i][1];

      int startB = intervals[i + 1][0];
      int endB = intervals[i + 1][1];

      if (startB >= minheap.peek()) {
        minheap.poll();
      }

      minheap.offer(endB);
    }
    return minheap.size();
  }
}
