package stack;

import java.util.Stack;

/**
 * In reverse Polish notation, the operators follow their operands. For example,
 * to add 3 and 4 together, the expression is 3 4 + rather than 3 + 4. The
 * conventional notation expression 3 − 4 + 5 becomes 3 4 − 5 + in reverse
 * Polish notation: 4 is first subtracted from 3, then 5 is added to it.
 *
 * Input: tokens = ["2","1","+","3","*"]
 * Output: 9
 * Explanation: ((2 + 1) * 3) = 9
 */
public class EvaluateReversePolishNotation_150 {
  public int evalRPN(String[] tokens) {
    Stack<Integer> stack = new Stack<>();

    for (String token : tokens) {
      if (isOperator(token)) {
        int b = stack.pop(); // second operand
        int a = stack.pop(); // first operand
        int result = applyOperation(a, b, token);
        stack.push(result);
      } else {
        // If it's a number, push it to the stack
        stack.push(Integer.parseInt(token));
      }
    }

    return stack.pop(); // The final result will be at the top of the stack
  }

  private boolean isOperator(String token) {
    return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
  }

  private int applyOperation(int a, int b, String operator) {
    switch (operator) {
      case "+":
        return a + b;
      case "-":
        return a - b;
      case "*":
        return a * b;
      case "/":
        return a / b; // Integer division
    }
    return -1;
  }
}
