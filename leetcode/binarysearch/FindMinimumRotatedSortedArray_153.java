package binarysearch;

/**
 * Input: nums = [3,4,5,1,2]
 * Output: 1
 * 
 * Input: nums = [4,5,6,7,0,1,2]
 * Output: 0
 */
public class FindMinimumRotatedSortedArray_153 {
  public int findMin(int[] nums) {
    // INSERT METHOD HERE
    return -1;
  }

  public int logarithmic(int[] nums) {
    int n = nums.length;
    int left = 0;
    int right = n - 1;
    while (left < right) {
      int mid = left + (right - left) / 2;
      if (nums[mid] > nums[right]) {
        left = mid + 1;
      } else {
        right = mid;
      }
    }
    return nums[left];
  }

  public int linear(int[] nums) {
    int n = nums.length;
    int current = nums[0];
    for (int i = 1; i < n; ++i) {
      if (nums[i] < current) {
        current = nums[i];
      }
    }
    return current;
  }
}
