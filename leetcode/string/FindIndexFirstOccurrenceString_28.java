package string;

/**
 */
public class FindIndexFirstOccurrenceString_28 {
  public int strStr(String haystack, String needle) {
    for (int i = 0; i < haystack.length() - needle.length(); ++i) {
      if (haystack.charAt(i) == needle.charAt(0)) {
        if (haystack.substring(i, needle.length()).equals(needle)) {
          return i;
        }
      }
    }
    return -1;
  }
}