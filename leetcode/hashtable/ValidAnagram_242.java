package hashtable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Example 1:
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * 
 * Example 2:
 * Input: s = "rat", t = "car"
 * Output: false
 */
@SuppressWarnings("unused") // Nvim
public class ValidAnagram_242 {
  public boolean isAnagram(String s, String t) {
    Map<Character, Integer> map = new HashMap<>();
    for (char character : s.toCharArray()) {
      int freq = map.getOrDefault(character, 0);
      map.put(character, freq + 1);
    }

    for (char character : t.toCharArray()) {
      int freq = map.getOrDefault(character, 0);
      map.put(character, freq - 1);

      if (!map.containsKey(character)) {
        return false;
      }
    }

    for (int keys : map.values()) {
      if (keys != 0) {
        return false;
      }
    }
    return true;
  }
}
