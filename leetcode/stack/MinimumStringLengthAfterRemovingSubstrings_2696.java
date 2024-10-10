package stack;

import java.util.Stack;

/**
 * Input: s = "ABFCACDB"
 * Output: 2
 * Note:
 * that the string concatenates after removing the substring and could produce
 * new "AB" or "CD" substrings.
 *
 * Explanation: We can do the following operations:
 * - Remove the substring "ABFCACDB", so s = "FCACDB".
 * - Remove the substring "FCACDB", so s = "FCAB".
 * - Remove the substring "FCAB", so s = "FC".
 * So the resulting length of the string is 2.
 */
public class MinimumStringLengthAfterRemovingSubstrings_2696 {
  public int minLength(String s) {
    Stack<Character> stack = new Stack<>();
    for (char ch : s.toCharArray()) {
      if (!stack.isEmpty()) {
        if (stack.peek() == 'A' && ch == 'B') {
          stack.pop();
          continue; // skipp
        }
        if (stack.peek() == 'C' && ch == 'D') {
          stack.pop();
          continue; // skipp
        }
      }
      stack.push(ch);
    }
    return stack.size();
  }
}
