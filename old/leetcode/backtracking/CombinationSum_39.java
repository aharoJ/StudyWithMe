package backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Input: candidates = [2,3,6,7], target = 7
 * Output: [[2,2,3],[7]]
 * 
 * Input: candidates = [2,3,5], target = 8
 * Output: [[2,2,2,2],[2,3,3],[3,5]]
 */
class CombinationSum_39 {
  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> inner = new ArrayList<>();

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
      inner.add(candidates[i]);
      helper(candidates, target - candidates[i], result, inner, i);
      inner.remove(inner.size() - 1);
    }
  }
}
