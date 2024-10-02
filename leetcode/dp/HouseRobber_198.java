package dp;

import java.util.HashMap;
import java.util.Map;

/**
 * HouseRobber_198
 */
public class HouseRobber_198 {
  private Map<Integer, Integer> memo = new HashMap<>();

  public int rob(int[] nums) {
    // INSERT EITHER memoized(n) OR tabulation(n) HERE
    return -1;
  }

  public int tabulation(int[] nums) {
    int n = nums.length;

    if (n == 0 || nums == null) {
      return 0;
    }

    if (n == 1) {
      return nums[0];
    }
    if (n == 2) {
      return Math.max(nums[0], nums[1]);
    }

    int[] cache = new int[n];
    cache[0] = nums[0];
    cache[1] = Math.max(nums[0], nums[1]);
    for (int i = 2; i < n; ++i) {
      cache[i] = Math.max(cache[i - 1], nums[i] + cache[i - 2]);
    }
    return cache[n - 1];
  }

  public int memoize(int[] nums) {
    int n = nums.length;
    if (nums == null || nums.length == 0) {
      return 0;
    }

    if (n == 1) {
      return nums[0];
    }

    if (n == 2) {
      return Math.max(nums[0], nums[1]);
    }

    return Math.max(helper(nums, n - 1), helper(nums, n - 2));
  }

  private int helper(int[] nums, int i) {
    if (i == 0) {
      return nums[i]; // populate the 1st houst
    }
    if (i == 1) {
      return Math.max(nums[0], nums[1]);
    }

    if (memo.containsKey(i)) {
      return memo.get(i);
    }

    int twostep = nums[i] + helper(nums, i - 2);
    int step = helper(nums, i - 1);
    int computation = Math.max(step, twostep);

    memo.put(i, computation);

    return computation;
  }
}
