package linkedlist;

/**
 * Input: n = 19
 * Output: true
 * Explanation:
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 */

public class HappyNumber_202 {
  public boolean isHappy(int n) {
    int slow = n;
    int fast = n;

    do {
      slow = findSquare(slow);
      fast = findSquare(findSquare(fast));
    } while (slow != fast);
    if (slow == 1) {
      return true;
    }
    return false;
  }

  static int findSquare(int num) {
    int sum = 0;
    while (num > 0) {
      int remainder = num % 10;
      sum += remainder * remainder;
      num /= 10;
    }
    return sum;
  }
}
