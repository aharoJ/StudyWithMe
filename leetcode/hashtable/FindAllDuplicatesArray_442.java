package hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * FindAllDuplicatesArray_442
 */
public class FindAllDuplicatesArray_442 {
  public List<Integer> findDuplicates(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int vals : nums) {
      int freq = map.getOrDefault(vals, 0);
      map.put(vals, freq + 1);
    }

    List<Integer> result = new ArrayList<>();
    for (int numbers : map.keySet()) {
      if (map.get(numbers) >= 2) {
        result.add(numbers);
      }
    }
    return result;
  }
}
