package backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Input: nums = [1,2,3]
 * Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 *
 * Input: nums = [0,1]
 * Output: [[0,1],[1,0]]
 */
class Solution {
  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> inner = new ArrayList<>();
    helper(nums, result, inner);
    return result;
  }

  private void helper(int[] nums, List<List<Integer>> result, List<Integer> inner) {
    if (inner.size() == nums.length) {
      result.add(new ArrayList<>(inner));
      return;
    }

    for (int i = 0; i < nums.length; ++i) {
      if (!inner.contains(nums[i])) {
        inner.add(nums[i]);
        helper(nums, result, inner);
        inner.remove(inner.size() - 1);
      }
    }
  }
}
