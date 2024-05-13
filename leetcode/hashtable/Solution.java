package hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Example 1:
 * Input: nums = [2,2,1]
 * Output: 1
 * 
 * Example 2:
 * Input: nums = [4,1,2,1,2]
 * Output: 4
 */
@SuppressWarnings("unused") // Nvim
class Solution {

  public int singleNumber(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int val : nums) {
      int freq = map.getOrDefault(val, 0);
      map.put(val, freq + 1);
    }

    int unique_num = 0;
    for (int val : map.keySet()) {
      if (map.get(val) == 1) {
        unique_num = val;
      }
    }
    return unique_num;
  }
}
