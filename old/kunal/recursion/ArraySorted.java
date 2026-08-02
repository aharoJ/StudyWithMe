/**
 * ArraySorted
 */
public class ArraySorted {
  public static void main(String[] args) {
    // int[] nums = { 1, 2, 4, 3, 6, 8 };
    int[] nums = { 1, 2, 4, 6, 8 };
    System.out.println(isSorted(nums, 0));
  }

  static boolean isSorted(int[] nums, int index) {
    if (index == nums.length - 1) {
      return true;
    }
    return nums[index] < nums[index + 1] && isSorted(nums, index + 1);
  }
}
