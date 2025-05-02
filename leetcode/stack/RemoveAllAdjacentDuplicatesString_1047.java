import java.util.Stack;

/**
 * RemoveAllAdjacentDuplicatesString_1047
 */
class Solution {
  public String removeDuplicates(String s) {
    Stack<Character> stack = new Stack<>();

    for (char ch : s.toCharArray()) {
      if (stack.isEmpty()) {
        stack.push(ch);
        continue;
      }

      if (stack.peek() != ch) {
        stack.push(ch);
      } else {
        stack.pop();
      }
    }

    StringBuilder sb = new StringBuilder();
    for (char c : stack) {
      sb.append(c);
    }
    return sb.toString();

    // []
    // [a]
    // [ab]
    // [abb] -- here we should remove bb
  }
}
