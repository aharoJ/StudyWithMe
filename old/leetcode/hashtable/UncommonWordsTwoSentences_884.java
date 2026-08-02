package hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * UncommonWordsTwoSentences_884
 */
public class UncommonWordsTwoSentences_884 {
  public String[] uncommonFromSentences(String A, String B) {
    Map<String, Integer> map = new HashMap<>();
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
