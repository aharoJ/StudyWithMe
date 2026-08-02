package dp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 */
@SuppressWarnings("unused") // Nvim
class Solution {
  public String longestPalindrome(String s) {
    int n = s.length();
    int startIdx = 0;
    int endIdx = 0;

    for (int center = 0; center < n; ++center) {
      for (int shift = 0; shift <= 1; ++shift) {
        int leftPointer = center;
        int rightPointer = center + shift;

        while (leftPointer >= 0 && rightPointer < n && s.charAt(leftPointer) == s.charAt(rightPointer)) {
          leftPointer--;
          rightPointer++;
        }

        leftPointer++;
        rightPointer--;

        // Check if the current palindrome is longer than the previously found one
        // If true, update the start and end indices of the longest palindrome
        if (rightPointer - leftPointer > endIdx - startIdx) {
          startIdx = leftPointer;
          endIdx = rightPointer;
        }
      }
    }

    // Return the longest palindrome substring found
    // Use substring from startIdx to endIdx (inclusive)
    return s.substring(startIdx, endIdx + 1);
  }
}
