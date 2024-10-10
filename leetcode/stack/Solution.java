package stack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 */
@SuppressWarnings("unused") // nvim
class Solution {
  public int minSwaps(String s) {
    Stack<Character> stack = new Stack<>();
    int unbalanced = 0;
    for (char ch : s.toCharArray()) {
      // If an opening bracket is encountered, push it in the stack.
      if (ch == '[') {
        stack.push(ch);
      } else {
        // If the stack is not empty, pop it.
        if (!stack.isEmpty()) {
          stack.pop();
        } else {
          // Otherwise increase the count of unbalanced brackets.
          unbalanced++;
        }
      }
    }
    return (unbalanced + 1) / 2;
  }
}
