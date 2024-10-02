package kadane;

/**
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 */
public class MaximumSubarray_53 {
  public int maxSubArray(int[] nums) {
    int sum = 0;
    // int left = 0; // NO NEED NOT SLIDING WINDOW
    int sol = nums[0];
    for (int right = 0; right < nums.length; ++right) {
      sum += nums[right];
      sol = Math.max(sol, sum);
      if (sum < 0) {
        sum = 0;
      }
    }
    return sol;
  }
}
