package stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Solution
 */
@SuppressWarnings("unused") // nvim
class Solution {
  public int[] smallerNumbersThanCurrent(int[] nums) {
    int[] result = new int[nums.length];
    return helper(nums, result, 0, 0, 0);
  }

  static int[] helper(int[] nums, int[] result, int i, int j, int count) {
    // Base case: when i reaches the end of the array, return the result array
    if (i == nums.length) {
      return result;
    }

    // Base case: when j has compared all elements with nums[i]
    if (j == nums.length) {
      result[i] = count;
      return helper(nums, result, i + 1, 0, 0); // Move to the next element (i + 1) and reset j and count
    }
    if (nums[i] > nums[j]) {
      count++;
    }
    return helper(nums, result, i, j + 1, count);
  }
}
