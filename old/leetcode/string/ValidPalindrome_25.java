package string;

/**
 */
public class ValidPalindrome_25 {
  public boolean isPalindrome(String s) {
    s = s.toLowerCase();
    StringBuilder string = new StringBuilder();

    for (char c : s.toCharArray()) {
      if (Character.isLetterOrDigit(c)) {
        string.append(c);
      }
    }

    int left = 0;
    int right = string.length() - 1;
    while (left < right) {
      if (string.charAt(left) != string.charAt(right)) {
        return false;
      }
      left++;
      right--;
    }

    return true;
  }
}
