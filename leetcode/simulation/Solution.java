package simulation;

/**
 * Solution
 */
public class Solution {
  public boolean lemonadeChange(int[] bills) {
    int fiveDollars = 0;
    int tenDollars = 0;
    int twentyDollars = 0; // not used ?
    for (int bill : bills) {
      if (bill == 5) {
        fiveDollars++;
      } else if (bill == 10) {
        if (fiveDollars > 0) {
          fiveDollars--;
          tenDollars++;
        } else {
          return false;
        }
      } else if (bill == 20) {
        if (tenDollars > 0 && fiveDollars > 0) {
          tenDollars--;
          fiveDollars--;
        } else if (fiveDollars >= 3) {
          fiveDollars -= 3;
        } else {
          return false;
        }
      }
    }
    return true;
  }
}
