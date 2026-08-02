package slidingwindow;

/**
 * MaxConsecutiveOnes_485
 */
public class MaxConsecutiveOnes_485 {
  public int findMaxConsecutiveOnes(int[] nums) {
    int count = 0;
    int sol = 0;
    int left = 0;
    for (int right = 0; right < nums.length; ++right) {
      if (nums[right] == 1) {
        count++;
      } else {
        sol = Math.max(sol, count);
        count = 0;
        left = right;
      }
    }
    sol = Math.max(sol, count);
    return sol;
  }
}
