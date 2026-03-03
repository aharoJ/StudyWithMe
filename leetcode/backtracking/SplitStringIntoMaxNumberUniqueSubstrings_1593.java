package backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * SplitStringIntoMaxNumberUniqueSubstrings_1593
 */
public class SplitStringIntoMaxNumberUniqueSubstrings_1593 {
  private int sol = 0;

  public int maxUniqueSplit(String s) {
    List<String> result = new ArrayList<>();
    helper(s, result, 0);
    return sol;
  }

  private void helper(String s, List<String> result, int start) {
    if (start == s.length()) {
      sol = Math.max(sol, result.size());
      return;
    }

    for (int i = start; i < s.length(); ++i) {
      String substring = s.substring(start, i + 1);
      if (!result.contains(substring)) {
        result.add(substring);
        helper(s, result, i + 1);
        result.remove(result.size() - 1);
      }
    }
  }
}
