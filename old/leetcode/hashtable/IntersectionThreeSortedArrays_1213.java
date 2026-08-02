package hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Example 1:
 * Input: arr1 = [1,2,3,4,5], arr2 = [1,2,5,7,9], arr3 = [1,3,4,5,8]
 * Output: [1,5]
 * Explanation: Only 1 and 5 appeared in the three arrays.
 * 
 * Example 2:
 * Input: arr1 = [197,418,523,876,1356], arr2 = [501,880,1593,1710,1870], arr3 =
 * [521,682,1337,1395,1764]
 * Output: []
 */
@SuppressWarnings("unused") // Nvim
public class IntersectionThreeSortedArrays_1213 {

  public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
    Map<Integer, Integer> map = new HashMap<>();
    List<Integer> list = new ArrayList<>();
    for (int val : arr1) {
      int freq = map.getOrDefault(val, 0);
      map.put(val, freq + 1);
    }
    for (int val : arr2) {
      int freq = map.getOrDefault(val, 0);
      map.put(val, freq + 1);
    }
    for (int val : arr3) {
      int freq = map.getOrDefault(val, 0);
      map.put(val, freq + 1);

    }

    for (int val : map.keySet()) {
      if (map.get(val) == 3) {
        list.add(val);
      }
    }

    return list;
  }

  public static void main(String[] args) {
    IntersectionThreeSortedArrays_1213 solution = new IntersectionThreeSortedArrays_1213();

    int[] arr1 = { 1, 2, 3, 4, 5 };
    int[] arr2 = { 1, 2, 5, 7, 9 };
    int[] arr3 = { 1, 3, 4, 5, 8 };
    System.out.println(solution.arraysIntersection(arr1, arr2, arr3)); // [1, 5]

    int[] arr4 = { 197, 418, 523, 876, 1356 };
    int[] arr5 = { 501, 880, 1593, 1710, 1870 };
    int[] arr6 = { 521, 682, 1337, 1395, 1764 };
    System.out.println(solution.arraysIntersection(arr4, arr5, arr6)); // []
  }
}
