package binarysearch;

/**
 * Input: nums = [-1,0,3,5,9,12], target = 9
 * Output: 4
 * 
 * Input: nums = [-1,0,3,5,9,12], target = 2
 * Output: -1
 */
public class BinarySearch_704 {
  public int search(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (nums[mid] == target) {
        return mid;
      }

      if (nums[mid] > target) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    return -1;
  }
}
