package dp;

/**
 * HouseRobberII_213
 */
public class HouseRobberII_213 {
  public int rob(int[] nums) {
    int n = nums.length;
    if (n == 1) {
      return nums[0];
    }

    if (n == 2) {
      return Math.max(nums[0], nums[1]);
    }

    return Math.max(helper(nums, 0, n - 2), helper(nums, 1, n - 1));
  }

  private int helper(int[] nums, int start, int end) {
    int step = nums[start];
    int twoSteps = Math.max(step, nums[start + 1]);

    for (int i = start + 2; i <= end; i++) {
      int memo = twoSteps;
      twoSteps = Math.max(twoSteps, step + nums[i]);
      step = memo;
    }
    return twoSteps;
  }
}
