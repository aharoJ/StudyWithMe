package hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * Two strings s and t are isomorphic if the characters in s can be replaced to
 * get t, and characters in t can be replaced to get s
 * - https://www.youtube.com/watch?v=RH_PRwpX9G0
 */
public class IsomorphicStrings_205 {
  private String transformString(String s) {
    Map<Character, Integer> map = new HashMap<>();
    StringBuilder string = new StringBuilder();

    for (int i = 0; i < s.length(); ++i) {
      char charS = s.charAt(i);
      if (!map.containsKey(charS)) {
        map.put(charS, i);
      }

      string.append(Integer.toString(map.get(charS)));
      string.append(" ");
    }
    return string.toString()
  }

  public boolean isIsomorphic(String s, String t) {
    return transformString(s).equals(t);
  }

}
