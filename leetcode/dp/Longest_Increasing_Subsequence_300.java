package dp;

import java.util.Arrays;

/**
 * Input: nums = [10,9,2,5,3,7,101,18]
 * Output: 4
 *
 * Explanation:
 * The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
 */
class Longest_Increasing_Subsequence_300 {
  public int lengthOfLIS(int[] nums) {
    int[] dp = new int[nums.length];
    Arrays.fill(dp, 1);
    int max_length = 1;
    for (int i = 1; i < nums.length; ++i) {
      for (int j = 0; j < i; ++j) {
        if (nums[i] > nums[j]) {
          dp[i] = Math.max(dp[i], dp[j] + 1);
        }
      }
      max_length = Math.max(max_length, dp[i]);
    }
    return max_length;
  }
}
