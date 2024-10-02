package binarysearch;

/**
 * Input: piles = [3,6,7,11], h = 8
 * Output: 4
 * 
 * Input: piles = [30,11,23,4,20], h = 5
 * Output: 30
 */
public class KokoEatingBananas_875 {
  public int minEatingSpeed(int[] piles, int h) {
    int left = 1, right = 1;
    for (int pile : piles) {
      right = Math.max(right, pile);
    }

    while (left < right) {
      int mid = left + (right - left) / 2;
      int hours_eating = 0;

      for (int pile : piles) {
        hours_eating += Math.ceil((double) pile / mid);

        if (hours_eating >= h) {
          right = mid;
        } else {
          left = mid + 1;
        }
      }
    }
    return left;

  }
}
