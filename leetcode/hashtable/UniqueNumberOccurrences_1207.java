package hashtable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Input: arr = [1,2,2,1,1,3]
 * Output: true
 * 
 * 
 * Input: arr = [1,2]
 * Output: false
 */
public class UniqueNumberOccurrences_1207 {
  public boolean uniqueOccurrences(int[] arr) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int num : arr) {
      int freq = map.getOrDefault(num, 0);
      map.put(num, freq + 1);
    }

    Set<Integer> set = new HashSet<>();
    for (int values : map.values()) {
      if (!set.contains(values)) {
        set.add(values);
      } else {
        return false;
      }
    }
    return true;
  }
}
