package recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 */
public class LetterCombinationsPhoneNumber_17 {
  static HashMap<Integer, String> map() {
    HashMap<Integer, String> map = new HashMap<>();
    map.put(1, "");
    map.put(2, "abc");
    map.put(3, "def");
    map.put(4, "ghi");
    map.put(5, "jkl");
    map.put(6, "mno");
    map.put(7, "pqrs");
    map.put(8, "tuv");
    map.put(9, "wxyz");
    map.put(0, "");
    return map;
  }

  public List<String> letterCombinations(String digits) {
    // Return an empty list if the input is an empty string
    if (digits.isEmpty()) {
      return new ArrayList<>();
    }
    HashMap<Integer, String> map = map();
    return helper(digits, "", map);
  }

  static List<String> helper(String digits, String processed, HashMap<Integer, String> map) {
    List<String> result = new ArrayList<>();
    if (digits.isEmpty()) {
      result.add(processed);
      return result;
    }
    char ch = digits.charAt(0);
    String letters = map.get(ch - '0');
    for (int i = 0; i < letters.length(); ++i) {
      char letter = letters.charAt(i);
      result.addAll(helper(digits.substring(1), processed + letter, map));
    }
    return result;
  }
}
