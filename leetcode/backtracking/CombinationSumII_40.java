package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Input: candidates = [10,1,2,7,6,1,5], target = 8
 * Output:
 * [
 * [1,1,6],
 * [1,2,5],
 * [1,7],
 * [2,6]
 * ]
 * ---------------------------------------------------
 * Input: candidates = [2,5,2,1,2], target = 5
 * Output:
 * [
 * [1,2,2],
 * [5]
 * ]
 */
class CombinationSumII_40 {
  public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> inner = new ArrayList<>();
    Arrays.sort(candidates);
    helper(candidates, target, result, inner, 0);

    return result;
  }

  private void helper(int[] candidates, int target, List<List<Integer>> result, List<Integer> inner, int start) {
    if (target == 0) {
      result.add(new ArrayList<>(inner));
      return;
    }

    if (target < 0) {
      return;
    }

    for (int i = start; i < candidates.length; i++) {
      if (i > start && candidates[i] == candidates[i - 1]) {
        continue;
      }
      inner.add(candidates[i]);
      helper(candidates, target - candidates[i], result, inner, i + 1);
      inner.remove(inner.size() - 1);
    }
  }
}
