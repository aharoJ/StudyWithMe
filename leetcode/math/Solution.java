package math;

/**
 * Solution
 */
class Solution {
  public long findTheArrayConcVal(int[] nums) {
    long left = 0;
    long right = nums.length - 1;
    long sum = 0;
    while (left <= right) {
      if (left == right) {
        sum += nums[left];
      } else {
        String concatenated = String.valueOf(nums[left]) + String.valueOf(nums[right]);
        sum += Long.parseLong(concatenated); // Add the concatenated value to the total
      }
      left++;
      right--;
    }

    return sum;
  }
}
