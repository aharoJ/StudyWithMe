package twopointer;

/**
 * Input: s = "aba"
 * Output: true
 * 
 * Input: s = "abca"
 * Output: true
 * 
 * Input: s = "abc"
 * Output: false
 */
public class ValidPalindromeII_680 {
  public boolean validPalindrome(String s) {
    String str = s.replaceAll("[^A-Z^a-z^0-9]", "").toLowerCase();
    int left = 0;
    int right = str.length() - 1;
    while (left < right) {
      if (str.charAt(left) != str.charAt(right)) {
        return middleOutwards(str, left + 1, right) || middleOutwards(str, left, right - 1);
      }
      left++;
      right--;
    }
    return true;
  }

  private boolean middleOutwards(String str, int left, int right) {
    while (left < right) {
      if (str.charAt(left) != str.charAt(right)) {
        return false;
      }
      left++;
      right--;
    }
    return true;
  }
}
