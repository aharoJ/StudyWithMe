package twopointer;

/**
 * Input: numbers = [2,7,11,15], target = 9
 * Output: [1,2]
 * 
 * Input: numbers = [2,3,4], target = 6
 * Output: [1,3]
 */
public class TwoSumIIInputArrayIsSorted_167 {
  public int[] twoSum(int[] numbers, int target) {
    // INSERT EITHER OF THE FOLLOWING METHODS HERE
    return null;
  }

  public int[] twoPointer(int[] numbers, int target) {
    int left = 0;
    int right = numbers.length - 1;
    while (left < right) {
      if (numbers[left] + numbers[right] == target) {
        return new int[] { left + 1, right + 1 };
      }
      if (numbers[left] + numbers[right] < target) {
        left++;
      } else {
        right--;
      }
    }
    return null;
  }

  public int[] bruteForce(int[] numbers, int target) {
    int n = numbers.length;
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (numbers[j] + numbers[i] == target) {
          return new int[] { i + 1, j + 1 };
        }
      }
    }
    return null;
  }

}
