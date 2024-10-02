package stack;

/**
 * ValidParentheses_20
 */
public class ValidParentheses_20 {
  public boolean isValid(String s) {
    Deque<Character> stack = new ArrayDeque<>(10000);
    for (char c : s.toCharArray()) {
      if (c == '[' || c == '(' || c == '{') {
        stack.push(c);
      } else if (stack.isEmpty() || !match(stack.pop(), c)) {
        return false;
      }
    }

    return stack.isEmpty();
  }

  private boolean match(char l, char r) {
    return (l == '(' && r == ')') || (l == '{' && r == '}') || (l == '[' && r == ']');
  }
}
