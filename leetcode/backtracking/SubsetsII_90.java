package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Input: nums = [1,2,3]
 * Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
 * 
 * Input: nums = [0]
 * Output: [[],[0]]
 *
 * Note: must sort
 */
public class SubsetsII_90 {
  public List<List<Integer>> subsetsWithDup(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> inner = new ArrayList<>();
    Arrays.sort(nums);
    helper(nums, result, inner, 0);
    return result;
  }

  private void helper(int[] nums, List<List<Integer>> result, List<Integer> inner, int start) {
    result.add(new ArrayList<>(inner));
    for (int i = start; i < nums.length; ++i) {
      // If the current element is a duplicate, ignore.
      if (i > start && nums[i] == nums[i - 1]) {
        continue;
      }
      inner.add(nums[i]);
      helper(nums, result, inner, i + 1);
      inner.remove(inner.size() - 1);
    }
  }
}
