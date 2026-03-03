package recursion;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Solution
 */
@SuppressWarnings("unused")
class Solution {
  public List<Long> minOperations(int[] nums, int[] q) {
    int n = nums.length;
    Arrays.sort(nums);

    List<Long> ans = new ArrayList<>();
    long[] prefix = new long[n + 1];
    for (int i = 1; i <= n; i++) {
      prefix[i] = prefix[i - 1] + nums[i - 1];
    }

    for (int val : q) {
      int i = Arrays.binarySearch(nums, val);
      if (i < 0)
        i = -(i + 1);
      ans.add(1L * val * (2 * i - n) + prefix[n] - 2 * prefix[i]);
    }
    return ans;
  }
}
