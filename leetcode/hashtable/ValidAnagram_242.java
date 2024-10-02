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
    if (s.length() != t.length()) {
      return false;
    }

    Map<Character, Integer> map = new HashMap<>();
    for (char ch : s.toCharArray()) {
      int freq = map.getOrDefault(ch, 0);
      map.put(ch, freq + 1);
    }

    for (char ch : t.toCharArray()) {
      if (map.containsKey(ch)) {
        int freq = map.getOrDefault(ch, 0);
        map.put(ch, freq - 1);
      }
    }

    for (char key : map.keySet()) {
      if (map.get(key) != 0) {
        return false;
      }
    }
    return true;

  }
}
