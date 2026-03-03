package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * Input: nums = [-1,0,1,2,-1,-4]
 * Output: [[-1,-1,2],[-1,0,1]]
 */
@SuppressWarnings("unused") // Nvim
class Solution {
  public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
    for (char ch : s.toCharArray()) {
      if (ch == '{' || ch == '(' || ch == '[') {
        stack.push(ch);
      } else {
        if (stack.empty()) {
          return false;
        }

        if (stack.peek() == '}' || stack.peek() == ')' || stack.peek() == ']') {
          if (stack.pop() != '{') {
            return false;
          }
          if (stack.pop() != '(') {
            return false;
          }
          if (stack.pop() != ')') {
            return false;
          }
        }
      }
    }
  }
}
