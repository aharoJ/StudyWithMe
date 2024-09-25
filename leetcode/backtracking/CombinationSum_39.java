package backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * CombinationSum_39
 */
class CombinationSum_39 {
  public static void main(String[] args) {
    int[] nums = { 2, 3, 5 };
    int target = 8;
    combinationSum(nums, target).forEach(System.out::println);
  }

  static List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<Integer> process = new ArrayList<>();
    return helper(candidates, target, process, 0);
  }

  static List<List<Integer>> helper(int[] candidates, int target, List<Integer> process, int start) {
    List<List<Integer>> result = new ArrayList<>();
    if (target == 0) {
      result.add(new ArrayList<>(process));
      return result;
    }
    if (target < 0) {
      return result;
    }
    for (int i = start; i < candidates.length; ++i) {
      process.add(candidates[i]);
      result.addAll(helper(candidates, target - candidates[i], process, i));
      // backtrack
      process.remove(process.size()-1);
    }
    return result;
  }
}
