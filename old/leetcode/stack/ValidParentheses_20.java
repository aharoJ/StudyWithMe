
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Input: s = "()"
 * Output: true
 * 
 * Input: s = "()[]{}"
 * Output: true
 */
class ValidParentheses_20 {
  public boolean isValidStack(String s) {
    Stack<Character> stack = new Stack<>();
    for (char ch : s.toCharArray()) {
      if (ch == '{' || ch == '(' || ch == '[') {
        stack.push(ch);
      } else {
        if (stack.isEmpty()) {
          return false;
        }

        if (stack.peek() == '{' && ch != '}') {
          return false;
        }
        if (stack.peek() == '(' && ch != ')') {
          return false;
        }
        if (stack.peek() == '[' && ch != ']') {
          return false;
        }
        stack.pop();
      }
    }
    return stack.isEmpty();
  }

  public boolean isValidHashMap(String s) {
    Map<Character, Character> map = mymap();
    Stack<Character> stack = new Stack<>();

    for (char ch : s.toCharArray()) {
      if (map.containsKey(ch)) { // Opening bracket
        stack.push(ch);
      } else { // Closing bracket
        if (stack.isEmpty() || map.get(stack.pop()) != ch) {
          return false;
        }
      }
    }
    return stack.isEmpty();
  }

  Map<Character, Character> mymap() {
    Map<Character, Character> map = new HashMap<>();
    map.put('(', ')');
    map.put('{', '}');
    map.put('[', ']');
    return map;
  }
}
