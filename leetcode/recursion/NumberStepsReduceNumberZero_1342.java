package recursion;

/**
 * NumberStepsReduceNumberZero_1342
 */
public class NumberStepsReduceNumberZero_1342 {
  public int numberOfSteps(int num) {
    return helper(num, 0);
  }

  static int helper(int num, int counter) {
    if (num == 0) {
      return counter;
    }

    if (num % 2 == 0) {
      return helper(num / 2, counter + 1);
    }
    return helper(num - 1, counter + 1);
  }
}
