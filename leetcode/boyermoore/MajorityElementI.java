package boyermoore;

/**
 * MajorityElementII
 */
class Solution {
  public int majorityElement(int[] nums) {
    int count = 0;
    int candidate = 0;

    // Step 1: Find a candidate for the majority element
    for (int num : nums) {
      if (count == 0) {
        candidate = num; // Choose a new candidate
      }
      count += (num == candidate) ? 1 : -1;
    }

    // Step 2: Return the candidate (guaranteed to be the majority element)
    return candidate;
  }
}
