package intervals;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * PointsThatIntersectWithCars_2848
 */
public class PointsThatIntersectWithCars_2848 {
  public int numberOfPoints(List<List<Integer>> nums) {
    Set<Integer> set = new HashSet<>();

    for (int i = 0; i < nums.size(); ++i) {
      int current = nums.get(i).get(0);
      int next = nums.get(i).get(1);

      for (int j = current; j <= next; ++j) {
        set.add(j);
      }
    }
    return set.size();
  }
}
