package hashtable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Example 1:
 * Input: arr = [1,2,2,1,1,3]
 * Output: true
 * 
 * Example 2:
 * Input: arr = [1,2]
 * Output: false
 * 
 * Example 3:
 * Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
 * Output: true
 */
public class UniqueNumberOccurrences_1207_Practice {

  public boolean uniqueOccurrences(int[] arr) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int val : arr) {
      int freq = map.getOrDefault(val, 0);
      map.put(val, freq + 1);
    }

    Set<Integer> set = new HashSet<>();
    for (int frequencies : map.values()) {
      if (!set.add(frequencies)) {
        return false;
      }
    }
    return true;
  }
}
