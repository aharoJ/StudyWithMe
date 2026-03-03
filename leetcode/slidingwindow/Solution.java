package slidingwindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
*/
@SuppressWarnings("unused") // Nvim
class Solution {
  public int findMaxConsecutiveOnes(int[] nums) { // Function to find the max number of consecutive 1s when flipping at
                                                  // most one 0
    int left = 0; // Left pointer for the sliding window (start of the window)
    int zerocount = 0; // Counter to track the number of zeros in the current window
    int sol = 0; // Variable to store the maximum number of consecutive 1s found

    // Loop through each element in the array with the right pointer
    for (int right = 0; right < nums.length; ++right) {
      if (nums[right] == 0) { // If the current element is 0
        zerocount++; // Increase the count of zeros in the window
      }

      // While there are more than 1 zero in the current window
      while (zerocount > 1) {
        if (nums[left] == 0) { // If the element at the left pointer is 0
          zerocount--; // Decrease the zero count (we are "shifting" the window)
        }
        left++; // Move the left pointer to the right to shrink the window
      }

      // Calculate the maximum length of 1s found by comparing with the previous
      // maximum
      sol = Math.max(sol, right - left + 1); // right - left + 1 gives the length of the current window
    }

    return sol; // Return the maximum length of consecutive 1s found
  }
}
