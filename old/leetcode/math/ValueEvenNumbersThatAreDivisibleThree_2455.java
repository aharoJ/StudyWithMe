package math;

/**
 * ValueEvenNumbersThatAreDivisibleThree_2455
 */
public class ValueEvenNumbersThatAreDivisibleThree_2455 {
  public int averageValue(int[] nums) {
    int sum = 0;
    int counter = 0;
    for (int i = 0; i < nums.length; ++i) {
      if (nums[i] % 3 == 0 && nums[i] % 2 == 0) {
        sum += nums[i];
        counter++;
      }
    }
    if (counter == 0) {
      return 0;
    }
    return sum / counter;
  }
}
