package set;

import java.util.HashSet;
import java.util.Set;

/**
 * Input: nums = [100,4,200,1,3,2]
 * Output: 4
 * maxLength-->[1, 2, 3, 4].
 */
public class LongestConsecutiveSequence_128 {
  private int maxLength = 0;

  public int longestConsecutive(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int num : nums) {
      set.add(num);
    }

    for (int number : set) {
      if (!set.contains(number - 1)) {
        int currentNumber = number;
        int currentStreak = 1;
        while (set.contains(currentNumber + 1)) {
          currentNumber++;
          currentStreak++;
        }
        maxLength = Math.max(maxLength, currentStreak);
      }
    }
    return maxLength;
  }
}
