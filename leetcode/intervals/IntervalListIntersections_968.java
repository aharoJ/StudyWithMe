package intervals;

import java.util.ArrayList;
import java.util.List;

/**
 * Input:
 * firstList = [[0,2],[5,10],[13,23],[24,25]]
 * secondList = [[1,5],[8,12],[15,24],[25,26]]
 * Output: [[1,2],[5,5],[8,10],[15,23],[24,24],[25,25]]
 * 
 * Input: firstList = [[1,3],[5,9]], secondList = []
 * Output: []
 */
class IntervalListIntersectios_968 {
  public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
    List<int[]> result = new ArrayList<>();
    int i = 0, j = 0;
    while (i < firstList.length && j < secondList.length) {
      int startA = firstList[i][0];
      int endA = firstList[i][1];

      int startB = secondList[j][0];
      int endB = secondList[j][1];

      if (startA <= endB && startB <= endA) {
        int startOverlap = Math.max(startA, startB);
        int endOverlap = Math.min(endA, endB);
        result.add(new int[] { startOverlap, endOverlap });
      }

      if (endA < endB) {
        i++;
      } else {
        j++;
      }
    }
    return result.toArray(new int[result.size()][]);
  }
}
