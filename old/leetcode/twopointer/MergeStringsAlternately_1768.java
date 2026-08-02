package twopointer;

/**
 * MergeStringsAlternately_1768
 */
public class MergeStringsAlternately_1768 {

  public String mergeAlternately(String word1, String word2) {
    char[] arr = new char[word1.length() + word2.length()];

    int left = 0, right = 0;
    StringBuilder string = new StringBuilder();
    for (int i = 0; i < arr.length; ++i) {
      if (left < word1.length()) {
        string.append(word1.charAt(left++));
      }

      if (right < word2.length()) {
        string.append(word2.charAt(right++));
      }
    }
    return string.toString();
  }
}
