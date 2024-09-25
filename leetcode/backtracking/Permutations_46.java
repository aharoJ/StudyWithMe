package backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Permutations_46
 */
public class Permutations_46 {
  public List<List<Integer>> permute(int[] nums) {
    boolean[] visisted = new boolean[nums.length];
    List<Integer> process = new ArrayList<>();
    return helper(nums, process, visisted);
  }

  static List<List<Integer>> helper(int[] nums, List<Integer> process, boolean[] visisted) {
    List<List<Integer>> result = new ArrayList<>();
    if (nums.length == process.size()) {
      result.add(new ArrayList<>(process));
      return result;
    }
    for (int i = 0; i < nums.length; ++i) {
      if (!visisted[i]) {
        visisted[i] = true;
        process.add(nums[i]);

        result.addAll(helper(nums, process, visisted));

        // backtrack
        visisted[i] = false;
        process.removeLast();
      }
    }
    return result;
  }
}
