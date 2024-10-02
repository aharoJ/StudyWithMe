package binarysearch;

/**
 * Input: nums = [4,5,6,7,0,1,2], target = 0
 * Output: 4
 * 
 * Input: nums = [4,5,6,7,0,1,2], target = 3
 * Output: -1
 * 
 */
public class SearchRotatedSortedArray_33 {
  public int search(int[] nums, int target) {
    // INSERT ONE OF THE FUNCTIONS BELOW
    return -1;
  }

  public int recursive(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;
    return helper(nums, target, left, right);
  }

  private int helper(int[] nums, int target, int left, int right) {
    if (left > right) {
      return -1;
    }
    int mid = left + (right - left) / 2;
    if (nums[mid] == target) {
      return mid;
    }
    if (nums[left] <= nums[mid]) {
      if (target >= nums[left] && target <= nums[mid]) {
        return helper(nums, target, left, mid - 1);
      } else {
        return helper(nums, target, mid + 1, right);
      }

    } else {
      if (target <= nums[right] && target >= nums[mid]) {
        return helper(nums, target, mid + 1, right);
      } else {
        return helper(nums, target, left, mid - 1);
      }
    }
  }

  public int iterative(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;
    while (left <= right) {
      int mid = left + (right - left);
      if (nums[mid] == target) {
        return mid;
      }

      if (nums[left] <= nums[mid]) {
        if (target >= nums[left] && target <= nums[mid]) {
          right = mid - 1;
        } else {
          left = mid + 1;
        }

      } else {
        if (target <= nums[right] && target >= nums[mid]) {
          left = mid + 1;
        } else {
          right = mid - 1;
        }
      }
    }
    return -1;
  }
}
