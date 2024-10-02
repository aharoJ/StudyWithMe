package hashtable.twosum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSumAllPairs {
  public List<List<Integer>> twoSumIndices(int[] nums, int target) {
    Map<Integer, Integer> numMap = new HashMap<>();
    List<List<Integer>> result = new ArrayList<>();

    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];

      if (numMap.containsKey(complement)) {
        List<Integer> pair = new ArrayList<>();
        pair.add(numMap.get(complement));
        pair.add(i);
        result.add(pair);
      }

      numMap.put(nums[i], i);
    }

    return result;
  }

  public List<List<Integer>> display(int[] nums, int target) {
    List<List<Integer>> result = new ArrayList<>();
    List<List<Integer>> pairs = twoSumIndices(nums, target);

    for (List<Integer> pair : pairs) {
      List<Integer> pairValues = new ArrayList<>();
      pairValues.add(nums[pair.get(0)]);
      pairValues.add(nums[pair.get(1)]);
      result.add(pairValues);
    }

    return result;
  }

  public static void main(String[] args) {
    TwoSumAllPairs solution = new TwoSumAllPairs();
    int[] nums = { 1, 2, 3, 4, 5 };
    int target = 6;
    List<List<Integer>> result = solution.display(nums, target);

    for (List<Integer> pair : result) {
      System.out.println(pair);
    }
  }
}
