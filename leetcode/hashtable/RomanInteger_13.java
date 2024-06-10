package hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * RomanInteger_13
 */
public class RomanInteger_13 {
  public int romanToInt(String s) {
    Map<Character, Integer> map = new HashMap<>();
    map.put('I', 1);
    map.put('V', 5);
    map.put('X', 10);
    map.put('L', 50);
    map.put('C', 100);
    map.put('D', 500);
    map.put('M', 1000);

    int res = 0;
    for (int i = 0; i < s.length(); ++i) {
      if (s.charAt(i + 1) < s.length() && map.get(s.charAt(i)) < map.get(s.charAt(i))) {
        res -= map.get(s.charAt(i));
      } else {
        res += map.get(s.charAt(i));
      }
    }
    return res;
  }
}
