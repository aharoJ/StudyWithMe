package intervals;

import java.util.ArrayList;
import java.util.List;

/**
 * IntervalListIntersections_968
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

      int startOverlap = Math.max(startA, startB);
      int endOverlap = Math.min(endA, endB);
      if (startOverlap <= endOverlap) {
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
