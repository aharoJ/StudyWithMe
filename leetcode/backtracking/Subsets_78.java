package backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Input: nums = [1,2,3]
 * Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
 * 
 * Input: nums = [0]
 * Output: [[],[0]]
 */
public class Subsets_78 {
  public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> inner = new ArrayList<>();
    helper(nums, result, inner, 0);
    return result;
  }

  private void helper(int[] nums, List<List<Integer>> result, List<Integer> inner, int start) {
    result.add(new ArrayList<>(inner));

    for (int i = start; i < nums.length; ++i) {
      if (!inner.contains(nums[i])) {
        inner.add(nums[i]);
        helper(nums, result, inner, i);
        inner.remove(inner.size() - 1);
      }
    }
  }
}
