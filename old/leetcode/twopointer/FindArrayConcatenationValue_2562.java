package twopointer;

/**
 * FindArrayConcatenationValue_2562
 */
public class FindArrayConcatenationValue_2562 {
  public long findTheArrayConcVal(int[] nums) {
    int left = 0;
    int right = nums.length - 1;
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
