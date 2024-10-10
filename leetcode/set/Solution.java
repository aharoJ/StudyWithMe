package set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Solution
 */
class Solution {
  public List<Integer> doubleAndShuffle(List<Integer> nums) {
    List<Integer> result = new ArrayList<>();
    for (int i = 0; i < nums.size(); ++i) {
      if (!result.contains(i)) {
        result.set(i, nums.get(i) * 2);
      } else {
        Collections.shuffle(result);
      }
    }
    return result;
  }
}
