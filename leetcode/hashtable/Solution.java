package hashtable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

/**
 * Input: ["hello", "world"]
 * Encoded: "5#hello5#world"
 */
@SuppressWarnings("unused") // Nvim
public class Solution {
  public String encode(List<String> strs) {
    StringBuilder encoded = new StringBuilder();
    for (String str : strs) {
      // Encode each string with its length and '#' as a delimiter
      encoded.append(str.length());
      encoded.append('#');
      encoded.append(str);
    }
    return encoded.toString();
  }

  public List<String> decode(String s) {
    List<String> decoded = new ArrayList<>();
    int currentIndex = 0;
    while (currentIndex < s.length()) {
      // Find the position of the delimiter '#'
      int delimPos = s.indexOf('#', currentIndex);

      // Extract the length of the string
      int length = Integer.parseInt(s.substring(currentIndex, delimPos));

      // Move to the actual string part after the length
      currentIndex = delimPos + 1;

      // Extract the string of the specified length
      String str = s.substring(currentIndex, currentIndex + length);
      decoded.add(str);

      // Move the pointer to the next encoded string
      currentIndex += length;
    }
    return decoded;
  }
}
