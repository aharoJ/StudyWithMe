package threepointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

/**
 */
@SuppressWarnings("unused") // Nvim
class Solution {
  public int minEatingSpeed(int[] piles, int h) {
    int left = 1, right = 1;
    for (int p : piles) {
      right = Math.max(right, p);
    }

    while (left < right) {
      int mid = left + (right - left) / 2;
      int timeEating = 0;
      for (int p : piles) {
        timeEating += Math.ceil((double) p / mid);
      }
      if (timeEating <= h) {
        right = mid;
      } else {
        left = mid + 1;
      }
    }
    return left;
  }
}
