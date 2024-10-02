package hashtable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * GroupAnagrams_49
 */
public class GroupAnagrams_49 {
class Solution {
  public List<List<String>> groupAnagrams(String[] strs) {
    Map<Map<Character, Integer>, List<String>> map = new HashMap<>();
    for (String str : strs) {
      Map<Character, Integer> freqMap = new HashMap<>();
      for (char ch : str.toCharArray()) {
        int freq = freqMap.getOrDefault(ch, 0);
        freqMap.put(ch, freq + 1);
      }

      if (!map.containsKey(freqMap)) {
        map.put(freqMap, new ArrayList<>());
      }

      map.get(freqMap).add(str);
    }

    return new ArrayList<>(map.values());
  }
}
