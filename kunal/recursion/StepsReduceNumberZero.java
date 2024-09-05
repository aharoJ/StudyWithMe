/**
 * StepsReduceNumberZero
 */
public class StepsReduceNumberZero {
  public static void main(String[] args) {
    int num = numberOfSteps(14);
    System.out.println(num);
  }

  static int numberOfSteps(int num) {
    return helper(num, 0);
  }

  static int helper(int n, int steps) {
    if (n == 0) {
      return steps;
    }

    if (n % 2 == 0) {
      return helper(n / 2, steps + 1);
    }
    return helper(n - 1, steps + 1);
  }
}
