import java.util.Stack;

public class BackspaceStringCompare_844 {
  public boolean backspaceCompare(String s, String t) {
    Stack<Character> stackOne = new Stack<>();
    for (char ch : s.toCharArray()) {
      if (ch != '#') {
        stackOne.push(ch);
      } else {
        if (!stackOne.isEmpty()) {
          stackOne.pop();
        } else {
          continue;
        }
      }
    }

    Stack<Character> stackTwo = new Stack<>();
    for (char ch : t.toCharArray()) {
      if (ch != '#') {
        stackTwo.push(ch);
      } else {
        if (!stackTwo.isEmpty()) {
          stackTwo.pop();
        } else {
          continue;
        }
      }
    }

    return stackOne.equals(stackTwo);
  }
}
