package slidingwindow;

/**
 * Input: target = 7, nums = [2,3,1,2,4,3]
 * Output: 2
 * 
 * Input: target = 4, nums = [1,4,4]
 * Output: 1
 * 
 * Input: target = 11, nums = [1,1,1,1,1,1,1,1]
 * Output: 0
 */
class MinimumSizeSubarraySum_209 {
  public int minSubArrayLen(int target, int[] nums) {
    int left = 0;
    int sol = Integer.MAX_VALUE;
    int sum = 0;
    for (int right = 0; right < nums.length; ++right) {
      sum += nums[right];
      while (sum >= target) {
        sol = Math.min(sol, right - left + 1);
        sum -= nums[left++];
      }
    }
    return sol == Integer.MAX_VALUE ? 0 : sol;
  }
}
