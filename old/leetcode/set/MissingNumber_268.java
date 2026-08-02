package set;

import java.util.HashSet;
import java.util.Set;

/**
 * Input: nums = [3,0,1]
 * Output: 2
 * 
 * Input: nums = [0,1]
 * Output: 2
 */
public class MissingNumber_268 {
  public int missingNumber(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int num : nums) {
      set.add(num);
    }

    int missing = 0;
    for (int i = 1; i <= nums.length; ++i) {
      if (!set.contains(i)) {
        missing = i;
      }
    }
    return missing;
  }
}
