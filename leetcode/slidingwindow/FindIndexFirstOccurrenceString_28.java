package slidingwindow;

/**
 * WORKS: return haystack.indexOf(needle);
 */
public class FindIndexFirstOccurrenceString_28 {
  public int strStr(String haystack, String needle) {
    int window = haystack.length() - needle.length();
    for (int i = 0; i <= window; ++i) {

      if (haystack.substring(i, i + needle.length()).equals(needle)) {
        return i;
      }

      if (haystack.isEmpty() || needle.isEmpty()) {
        return 0;
      }
    }
    return -1;
  }
}
