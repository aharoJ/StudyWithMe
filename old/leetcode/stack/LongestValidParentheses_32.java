package stack;

import java.util.Stack;

/**
 * LongestValidParentheses_32
 */
public class LongestValidParentheses_32 {
  public int longestValidParentheses(String s) {
    int best = 0;
    Stack<Integer> stack = new Stack<>();
    int last = -1;

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);

      if (c == '(') {
        stack.push(i);
      } else { // ')'
        if (!stack.isEmpty()) {
          stack.pop();
          if (stack.isEmpty()) {
            int run = i - last;
            best = Math.max(best, run);
          } else {
            int run = i - stack.peek();
            best = Math.max(best, run);
          }
        } else {
          last = i;
        }
      }
    }
    return best;
  }
}
