package recursion;

/**
 * Input: haystack = "sadbutsad", needle = "sad"
 * Output: 0
 * 
 * Input: haystack = "leetcode", needle = "leeto"
 * Output: -1
 */
public class HaystackAndNeedle {
  public int strStr(String haystack, String needle) {
    return helper(haystack, needle, 0); // Start recursion with index 0
  }

  private int helper(String haystack, String needle, int index) {
    // Base case 1: If the haystack is shorter than the needle, return -1
    if (haystack.length() < needle.length()) {
      return -1;
    }

    // Base case 2: If the haystack starts with the needle, return the current index
    if (haystack.startsWith(needle)) {
      return index;
    }

    // Recursive case: Check the rest of the haystack
    return helper(haystack.substring(1), needle, index + 1);
  }
}
