package string;

import java.util.HashSet;
import java.util.Set;

/**
*/
public class CountPairsSimilarStrings_2506 {
  public int similarPairs(String[] words) {

    int counter = 0;
    for (int i = 0; i < words.length; i++) {
      for (int j = i + 1; j < words.length; j++) {
        if (areSimilar(words[i], words[j])) {
          counter++;
        }
      }
    }
    return counter;
  }

  private boolean areSimilar(String word1, String word2) {
    Set<Character> set1 = new HashSet<>();
    for (char c : word1.toCharArray()) {
      set1.add(c);
    }

    Set<Character> set2 = new HashSet<>();
    for (char c : word2.toCharArray()) {
      set2.add(c);
    }
    return set1.equals(set2);
  }

}
