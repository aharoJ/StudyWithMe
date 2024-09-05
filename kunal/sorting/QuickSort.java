import java.util.Arrays;

/**
 * QuickSort
 */
public class QuickSort {
  public static void main(String[] args) {
    int[] nums = { 3, 4, 2, 1 };
    sort(nums, 0, nums.length - 1);
    System.out.println(Arrays.toString(nums));
  }

  static void sort(int[] nums, int lo, int hi) {
    if (lo >= hi) {
      return;
    }
    int left = lo;
    int right = hi;
    int mid = left + (right - left) / 2;
    int pivot = nums[mid];

    while (left <= right) {
      // reason why if it is already sorted, it will not swap
      while (nums[left] < pivot) {
        left++;
      }
      while (nums[right] > pivot) {
        right--;
      }
      if (left <= right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
        left++;
        right--;
      }
      // now my pivot is at the correct index, please sort the left and right
      sort(nums, lo, right);
      sort(nums, left, hi);
    }
  }

}
