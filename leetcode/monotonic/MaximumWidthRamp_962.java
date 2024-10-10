package monotonic;

import java.util.Stack;

/**
 * MaximumWidthRamp_962
 */
public class MaximumWidthRamp_962 {
  private int sol = 0;
  Stack<Integer> stack = new Stack<>();

  public int maxWidthRamp(int[] nums) {
    for (int i = 0; i < nums.length; ++i) {
      if (stack.isEmpty() || nums[stack.peek()] > nums[i]) {
        stack.push(i);
      }
    }

    for (int j = nums.length - 1; j >= 0; --j) {
      while (!stack.isEmpty() && nums[stack.peek()] <= nums[j]) {
        sol = Math.max(sol, j - stack.pop());
      }
    }
    return sol;
  }
}
