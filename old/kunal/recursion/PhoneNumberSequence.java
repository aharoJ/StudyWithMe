import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * PhoneNumberSequence
 */
public class PhoneNumberSequence {
  public static void main(String[] args) {
    List<String> result = letterCombination("");
    System.out.println(result);
  }

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

  static List<String> letterCombination(String digits) {
    HashMap<Integer, String> map = map(); // Get the digit-to-letter map
    return helper(digits, "", map); // Call helper function with initial processed string as empty
  }

  static List<String> helper(String digits, String processed, HashMap<Integer, String> map) {
    List<String> result = new ArrayList<>();

    // Base case: If there are no more digits, add the processed string to result
    if (digits.isEmpty()) {
      result.add(processed);
      return result;
    }

    char ch = digits.charAt(0); // Get the first digit
    String letters = map.get(ch - '0'); // Get the corresponding letters for this digit

    // Loop over all possible letters for this digit
    for (int i = 0; i < letters.length(); i++) {
      char letter = letters.charAt(i);
      result.addAll(helper(digits.substring(1), processed + letter, map));
    }
    return result;
  }

}
