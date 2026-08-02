package twopointer;

/**
 * Input: s = ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 */
public class ReversString_344 {
  public void reverseString(char[] s) {
    int left = 0;
    int right = s.length - 1;
    while (left < right) {
      char temp = s[left];
      s[left++] = s[right];
      s[right--] = temp;
    }
  }

  public static void main(String[] args) {
    ReversString_344 obj = new ReversString_344();
    char[] s = { 'h', 'e', 'l', 'l', 'o' };
    obj.reverseString(s);
    for (char c : s) {
      System.out.print(c + " ");
    }
  }
}
