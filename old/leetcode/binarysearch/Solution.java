package binarysearch;

/**
 * round up --> (banana / K) 3.01 --> 4
 *
 * banana: 3, 6, 7, 11
 * k:4---> 1, 2, 2, 3
 * h:----> 7, 5, 3, 0
 */
class Solution {
  public int minEatingSpeed(int[] piles, int h) {
    int left = 1;
    int right = 1; // place holder
    for (int pile : piles) {
      right = Math.max(right, pile);
    }

    while (left < right) {
      int k = left + (right - left) / 2;
      if (canFinish(piles, k, h)) {
        right = k;
      } else {
        left = k + 1;
      }
    }
    return right;
  }

  private boolean canFinish(int[] piles, int k, int h) {
    int hours = 0;
    for (int pile : piles) {
      hours += Math.ceil((double) pile / k);
    }
    return hours <= h;
  }
}
