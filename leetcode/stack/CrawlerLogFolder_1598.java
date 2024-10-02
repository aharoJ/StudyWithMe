package stack;

import java.util.Stack;

/**
 * "../" : Move to the parent folder of the current folder. (If you are already
 * in the main folder, remain in the same folder).
 * "./" : Remain in the same folder.
 * exist).
 * d1/ → Push d1/ → Stack: [d1/]
 * d2/ → Push d2/ → Stack: [d1/, d2/]
 * ../ → Pop d2/ → Stack: [d1/]
 * d21/ → Push d21/ → Stack: [d1/, d21/]
 * ./ → Do nothing → Stack: [d1/, d21/]
 */
public class CrawlerLogFolder_1598 {
  public int minOperations(String[] logs) {
    Stack<String> stack = new Stack<>();
    for (String log : logs) {
      if (log.equals("../")) {
        if (!stack.isEmpty()) {
          stack.pop();
        }
      } else if (!log.equals("./")) {
        stack.push(log);
      }
      // else If it's "./", do nothing (stay in the same folder)
    }
    return stack.size();
  }
}
