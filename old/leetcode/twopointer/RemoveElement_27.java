package twopointer;

/**
 * Example 1:
 * Input: nums = [3,2,2,3], val = 3
 * Output: 2, nums = [2,2,_,_]
 *
 * Example 2:
 * Input: nums = [0,1,2,2,3,0,4,2], val = 2
 * Output: 5, nums = [0,1,4,0,3,_,_,_]
 *
 * we basically remove the target from the array[i] and return it
 */
public class RemoveElement_27 {
  public int removeElement(int[] nums, int val) {
    int uniqueIndex = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != val) {
        nums[uniqueIndex++] = nums[i];
      }
    }
    return uniqueIndex;
  }
}
