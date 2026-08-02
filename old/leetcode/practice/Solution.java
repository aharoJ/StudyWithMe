package practice;

import java.util.HashMap;
import java.util.Map;

/**
 * map: key: value, value: frequency
 * key:1,4 Val: 2,4
 */
public class Solution {
  public int foundK(int[] array, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    int counter = 0;
    for (int i = 0; i < array.length; i++) {
      int delta = array[i]-target;
      if (map.containsKey(delta)) {
        counter += map.get(delta);
      }
      int freq = map.getOrDefault(array[i], 0);
      map.put(array[i], freq + 1);

    }
    return counter;
  }

  public static void main(String[] args) {
    int[] array = { 1, 1, 4, 4 };
    int target = 3;
    Solution ft = new Solution();
    System.out.println(ft.foundK(array, target));
  }
}
