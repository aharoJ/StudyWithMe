package boyermoore;

import java.util.ArrayList;
import java.util.List;

/**
 * MajorityElementII
 */
class Solution {
  public List<Integer> majorityElement(int[] nums) {
    List<Integer> result = new ArrayList<>();

    if (nums == null || nums.length == 0) {
      return result;
    }

    // Step 1: Find potential candidates for the majority element
    int candidate1 = 0, candidate2 = 0, count1 = 0, count2 = 0;

    for (int num : nums) {
      if (num == candidate1) {
        count1++;
      } else if (num == candidate2) {
        count2++;
      } else if (count1 == 0) {
        candidate1 = num;
        count1 = 1;
      } else if (count2 == 0) {
        candidate2 = num;
        count2 = 1;
      } else {
        count1--;
        count2--;
      }
    }

    // Step 2: Verify if the candidates appear more than ⌊n/3⌋ times
    count1 = 0;
    count2 = 0;

    for (int num : nums) {
      if (num == candidate1) {
        count1++;
      } else if (num == candidate2) {
        count2++;
      }
    }

    int threshold = nums.length / 3;
    if (count1 > threshold) {
      result.add(candidate1);
    }
    if (count2 > threshold) {
      result.add(candidate2);
    }

    return result;
  }
}
