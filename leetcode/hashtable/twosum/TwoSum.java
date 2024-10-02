package hashtable.twosum;

import java.util.HashMap;
import java.util.Map;

/**
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * 
 * Example 2:
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 */
public class TwoSum {
  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; ++i) {
      int remainder = target - nums[i];
      if (map.containsKey(remainder)) {
        return new int[] { map.get(remainder), i };
      }
      map.put(nums[i], i);
    }
    return null;

  }

  public void display(int[] array) {
    for (int i = 0; i < array.length; ++i) {
      System.out.print("[" + array[i] + "]");
    }
  }

  public static void main(String[] args) {
    TwoSum solution = new TwoSum();
    int[] array = { 1, 2, 3, 4, 5 };
    int[] result = solution.twoSum(array, 6);
    if (result != null) {
      solution.display(result);
    } else {
      System.out.println("No two numbers add up to the target.");
    }
  }

}
