package array;

import java.util.Arrays;

/**
 * MajorityElement_169
 */
public class MajorityElement_169 {
  public int majorityElement(int[] nums) {
    int counter = 1;
    int numba = nums[0];
    Arrays.sort(nums);
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] == nums[i - 1]) {
        counter++;
      } else {
        counter = 1;
      }

      int freq = nums.length / 2;
      if (counter > freq) {
        numba = nums[i];
      }
    }
    return numba;
  }
}
