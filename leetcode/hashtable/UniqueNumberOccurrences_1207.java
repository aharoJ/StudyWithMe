package hashtable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOccurrences_1207 {

  public boolean uniqueOccurrences(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int val : nums) {
      int freq = map.getOrDefault(val, 0);
      map.put(val, freq + 1);
    }

    Set<Integer> set = new HashSet<>();
    for (int freq : map.values()) {
      if (!set.contains(freq)) {
        set.add(freq);
      } else {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 2, 1, 1, 3 };
    UniqueNumberOccurrences_1207 solution = new UniqueNumberOccurrences_1207();
    boolean result = solution.uniqueOccurrences(arr);
    System.out.println("Does each number have a unique number of occurrences? " + result);
  }
}
