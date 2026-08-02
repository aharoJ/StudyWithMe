package tiktok;

import java.util.Arrays;
import java.util.Stack;

/**

 */
class Solution {
  public int scoreOfParentheses(String S) {
    Stack<Integer> stack = new Stack<>();

    for (char c : S.toCharArray()) {
      if (c == '(') {
        stack.push(-1);
      } else {
        int score = 0;
        while (!stack.isEmpty() && stack.peek() != -1) {
          score += stack.pop();
        }
        stack.pop(); // pop the '('
        if (score == 0) {
          stack.push(1);
        } else {
          stack.push(2 * score);
        }
      }
    }

    int sum = 0;
    while (!stack.isEmpty()) {
      sum += stack.pop();
    }
    return sum;
  }
}
