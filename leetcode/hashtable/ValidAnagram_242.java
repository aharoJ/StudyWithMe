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
public class ValidAnagram_242 {
  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }
    Map<Character, Integer> map = new HashMap<>();
    for (Character string : s.toCharArray()) {
      int freq = map.getOrDefault(string, 0);
      map.put(string, freq + 1);
    }

    for (Character string : t.toCharArray()) {
      if (!map.containsKey(string)) {
        return false;
      }
      int freq = map.getOrDefault(string, 0);
      map.put(string, freq - 1);
      if (map.get(string) == 0) {
        map.remove(string);
      }
    }
    return map.isEmpty();
  }
}
