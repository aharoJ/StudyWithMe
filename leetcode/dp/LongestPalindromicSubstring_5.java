package dp;

/**
 * LongestPalindromicSubstring_5
 */
public class LongestPalindromicSubstring_5 {
  public String longestPalindrome(String s) {
    // Get the length of the input string
    int n = s.length();

    // Variables to store the start and end index of the longest palindrome found
    int startIdx = 0;
    int endIdx = 0;

    // Iterate over each character in the string, treating it as the center of a
    // potential palindrome
    for (int center = 0; center < n; ++center) {

      // Two cases:
      // 1. Odd-length palindrome (center, center)
      // 2. Even-length palindrome (center, center+1)
      for (int shift = 0; shift <= 1; ++shift) {

        // Initialize two pointers around the center
        int leftPointer = center;
        int rightPointer = center + shift;

        // Expand pointers outward as long as the characters are equal and pointers are
        // within bounds
        while (leftPointer >= 0 && rightPointer < n && s.charAt(leftPointer) == s.charAt(rightPointer)) {
          leftPointer--;
          rightPointer++;
        }

        // After exiting the loop, the pointers have gone one step too far,
        // so we adjust them back to the last valid palindrome
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
