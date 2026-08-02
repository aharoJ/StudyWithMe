package practice;

import java.util.HashMap;
import java.util.Map;

public class FindTargetHashMap {
  public int foundK(int[] array, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    int counter = 0;
    for (int val : array) {
      int delta = val - target;
      if (map.containsKey(delta)) {
        counter += map.get(delta);
      }
      int freq = map.getOrDefault(val, 0);
      map.put(val, freq + 1);
    }
    return counter;
  }

  public static void main(String[] args) {
    // int[] array = { 7, 2, 3, 8, 5, 6, 7, 8, 9 };
    // {1, 1, 4, 4} target is 3?

    int[] array = { 1, 1, 4, 4 };
    ;
    int target = 3;
    FindTargetHashMap ft = new FindTargetHashMap();
    System.out.println(ft.foundK(array, target));
  }
}
