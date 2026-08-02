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
    int currentTail = intervals[0][1];
    minheap.offer(currentTail);
    for (int i = 1; i < intervals.length; ++i) {
      int nextHead = intervals[i][0];
      int nextTail = intervals[i][1];
      if (!minheap.isEmpty() && minheap.peek() <= nextHead) {
        minheap.poll();
      }
      minheap.offer(nextTail);
    }
    return minheap.size();
  }
}
