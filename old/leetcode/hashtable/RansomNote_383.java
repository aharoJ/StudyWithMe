package hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * Input: ransomNote = "a", magazine = "b"
 * Output: false
 * 
 * Input: ransomNote = "aa", magazine = "ab"
 * Output: false
 * 
 * Input: ransomNote = "aa", magazine = "aab"
 * Output: true
 */
public class RansomNote_383 {

  public boolean canConstruct(String ransomNote, String magazine) {
    Map<Character, Integer> map = new HashMap<>();
    for (char c : ransomNote.toCharArray()) {
      int freq = map.getOrDefault(c, 0);
      map.put(c, freq + 1);
    }

    for (char c : magazine.toCharArray()) {
      int freq = map.getOrDefault(c, 0);
      map.put(c, freq - 1);
    }

    for (char v : map.keySet()) {
      if (map.get(v) > 0) {
        return false;
      }
    }
    return true;

  }
}
