package slidingwindow;

/**
 */
public class MaxConsecutiveOnesII_487 {
  public int findMaxConsecutiveOnes(int[] nums) {
    int left = 0;
    int sol = 0;
    int zerocount = 0;

    for (int right = 0; right < nums.length; ++right) {
      if (nums[right] == 0) {
        zerocount++;
      }

      // If there are more than 1 zeros, move the left pointer to the right
      while (zerocount > 1) {
        if (nums[left] == 0) {
          zerocount--;
        }
        left++;
      }

      // Calculate the maximum length of the window
      sol = Math.max(sol, right - left + 1);
    }

    return sol;
  }
}
