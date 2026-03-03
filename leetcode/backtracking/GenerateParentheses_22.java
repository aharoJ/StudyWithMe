
import java.util.ArrayList;
import java.util.List;

/**
 * Input: n = 3
 * Output: ["((()))","(()())","(())()","()(())","()()()"]
 * 
 * Input: n = 1
 * Output: ["()"]
 */
public class GenerateParentheses_22 {
  public List<String> generateParenthesis(int n) {
    List<String> result = new ArrayList<>();
    backtrack(result, "", 0, 0, n);
    return result;
  }

  private void backtrack(List<String> result, String current, int open, int close, int max) {
    // If the current string has reached the max length (2 * n), it's valid
    if (current.length() == max * 2) {
      result.add(current);
      return;
    }

    // Add an open parenthesis if we still have available '(' to use
    if (open < max) {
      backtrack(result, current + "(", open + 1, close, max);
    }

    // Add a close parenthesis if it would not exceed the number of open parentheses
    if (close < open) {
      backtrack(result, current + ")", open, close + 1, max);
    }
  }
}
