/**
 * Rotated Binary Search
 * Input: nums = [4,5,6,7,0,1,2], target = 0
 * Output: 4
 */
public class RBS {
  public static void main(String[] args) {
    int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
    int target = 0;
    System.out.println(findTarget(nums, target));
  }

  static int findTarget(int[] nums, int target) {
    return helper(nums, target, 0, nums.length - 1);
  }

  static int helper(int[] nums, int target, int left, int right) {
    // Base case: If the search range is invalid, return -1 (target not found)
    if (left > right) {
      return -1;
    }
    int mid = left + (right - left) / 2;
    if (nums[mid] == target) {
      return mid; 
    }

    // Determine which side is sorted
    if (nums[left] <= nums[mid]) { // Left side is sorted
      // Check if the target is within the sorted left half
      if (target >= nums[left] && target <= nums[mid]) {
        // Recur on the left half
        return helper(nums, target, left, mid - 1);
      } else {
        // Recur on the right half
        return helper(nums, target, mid + 1, right);
      }
    }

    // Otherwise, the right side must be sorted
    if (target >= nums[mid] && target <= nums[right]) {
      // If target is within the sorted right half, recur on the right half
      return helper(nums, target, mid + 1, right);
    }

    // If target is not in the sorted right half, recur on the left half
    return helper(nums, target, left, mid - 1);
  }
}
