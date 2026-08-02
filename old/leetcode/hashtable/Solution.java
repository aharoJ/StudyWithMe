package hashtable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

/**
 */
@SuppressWarnings("unused") // Nvim
class Solution {
  public String[] uncommonFromSentences(String A, String B) {
    Map<String, Integer> map = new HashMap();
    for (String word : A.split(" ")) {
      map.put(word, map.getOrDefault(word, 0) + 1);
    }
    for (String word : B.split(" "))
      map.put(
          word,
          map.getOrDefault(word, 0) + 1);
    // Collect words that appear exactly once
    List<String> result = new ArrayList<>();
    for (String word : map.keySet()) {
      if (map.get(word) == 1) {
        result.add(word);
      }
    }

    return result.toArray(new String[result.size()]);
  }
}
