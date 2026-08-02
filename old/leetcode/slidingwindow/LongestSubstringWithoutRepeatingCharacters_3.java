package slidingwindow;

import java.util.HashSet;
import java.util.Set;

/*
Input: prices = [7,1,5,3,6,4]
Output: 5
 */
public class LongestSubstringWithoutRepeatingCharacters_3 {
  public int lengthOfLongestSubstring(String s) {
    int left = 0, right = 0, counter = 0;
    Set<Character> set = new HashSet<>();
    while (right < s.length()) {
      if (!set.contains(s.charAt(right))) {
        set.add(s.charAt(right));
        right++;
      } else {
        set.remove(s.charAt(left));
        left++;
      }

      if (counter < set.size()) {
        counter++;
      }
    }
    return counter;
  }

  public static void main(String[] args) {
    LongestSubstringWithoutRepeatingCharacters_3 obj = new LongestSubstringWithoutRepeatingCharacters_3();
    System.out.println(obj.lengthOfLongestSubstring("abcabcbb")); // 3
  }
}
