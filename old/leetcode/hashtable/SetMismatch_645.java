package hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * Example 1:
 * Input: nums = [1,2,2,4]
 * Output: [2,3]
 * 
 * Example 2:
 * Input: nums = [1,1]
 * Output: [1,2]
 */
public class SetMismatch_645 {
  /**
   * key is : 1, value is : 1
   * key is : 2, value is : 2
   * key is : 2, value is : 3
   * key is : 4, value is : 4
   */
  public int[] findErrorNums(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int n : nums) {
      map.put(n, map.getOrDefault(n, 0) + 1);
    }
    int duplicate = 0;
    int missing = 0;
    for (int i = 0; i <= nums.length; ++i) {
      if (map.containsKey(i)) {
        if (map.get(i) == 2) {
          duplicate = i;
        }
      } else {
        missing = i;
      }
    }
    return new int[] { duplicate, missing };
  }
}
