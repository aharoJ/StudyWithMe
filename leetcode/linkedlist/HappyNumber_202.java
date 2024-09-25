package linkedlist;

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
