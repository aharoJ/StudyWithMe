package streamtransformations;

import java.util.Stack;
import java.util.stream.Collectors;

/**
 * RemoveStars
 */
public class RemoveStars {
  class RemovingStarsFromString_2390 {
    public String removeStars(String s) {
      Stack<Character> stack = new Stack<>();
      for (char c : s.toCharArray()) {
        if (c == '*') {
          if (!stack.isEmpty()) {
            stack.pop();
          }
        } else {
          stack.push(c);
        }
      }
      return stack.stream()
          .map(String::valueOf) // Convert each Character to String
          .collect(Collectors.joining()); // Join them together
    }
  }
}
