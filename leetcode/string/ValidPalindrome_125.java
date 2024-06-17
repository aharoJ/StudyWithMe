package string;

/**
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * 
 * Input: s = "race a car"
 * Output: false
 */
class ValidPalindrome_125 {
  public boolean isPalindrome(String s) {
    // Clean up the string
    String string = s.replaceAll("[^a-zA-Z0-9]", "");
    string = string.toLowerCase();

    int left = 0;
    int right = string.length() - 1;
    while (left < right) {
      if (string.charAt(left) != string.charAt(right)) {
        return false;
      } else {
        left++;
        right--;
      }
    }
    return true;
  }
}
