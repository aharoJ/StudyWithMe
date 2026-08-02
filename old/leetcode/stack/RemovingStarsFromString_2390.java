package stack;

import java.util.Stack;

/**
 * RemovingStarsFromString_2390
 */
public class RemovingStarsFromString_2390 {
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
    StringBuilder sb = new StringBuilder();
    while (!stack.isEmpty()) {
      sb.append(stack.pop());
    }
    return sb.reverse().toString();
    // --------------------------------------------------------
    // return stack.stream()
    // .map(String::valueOf) // Convert each Character to String
    // .collect(Collectors.joining()); // Join them together
  }
}
