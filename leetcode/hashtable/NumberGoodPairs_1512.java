package hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * Example 1:
 * Input: nums = [1,2,3,1,1,3]
 * Output: 4
 *
 * Example 2:
 * Input: nums = [1,1,1,1]
 * Output: 6
 *
 * Example 3:
 * Input: nums = [1,2,3]
 * Output: 0
 */
public class NumberGoodPairs_1512 {
  public int numIdenticalPairs(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    int counter = 0;
    for (int val : nums) {
      int freq = map.getOrDefault(val, 0);
      map.put(val, freq + 1);
      counter += freq;
    }
    return counter;
  }

  public static void main(String[] args) {
    NumberGoodPairs_1512 solution = new NumberGoodPairs_1512();
    int[] array = { 1, 2, 3, 1, 1, 3 };
    System.out.println(solution.numIdenticalPairs(array));

  }
}

/**
 * Personal Notes to come back for updated mentality
 * [1,2,3,1,1,3]
 * Key: nums[] Val: freq.
 * Key: 1 Val: 3
 * Key: 2 Val: 1
 * Key: 3 Val: 2
 * return 4 good pairs (0,3), (0,4), (3,4), (2,5)
 */
