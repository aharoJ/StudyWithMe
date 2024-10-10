package stack;

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
class Solution {
  public boolean isValid(String s) {
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
