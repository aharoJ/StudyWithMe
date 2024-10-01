package twopointer;

/**
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 *
 * Input: s = "race a car"
 * Output: false
 */
class ValidPalindrome_125 {
  public boolean isPalindrome(String s) {
    String str = s.replaceAll("[^A-Z^a-z^0-9]", "").toLowerCase();
    int left = 0;
    int right = str.length() - 1;
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
