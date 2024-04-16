import leetcode.tw


/**
 * Example 1:
 * Input: nums = [1,1,2]
 * Output: 2, nums = [1,2,_]
 * 
 * Example 2:
 * Input: nums = [0,0,1,1,1,2,2,3,3,4]
 * Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
 * two pointers approach
 */
public class RemoveDuplicatesSortedArray_26 {
  // public int removeDuplicates(int[] nums) {
  // int i = 0;
  // for (int j = 1; j < nums.length; j++) {
  // if (nums[j] != nums[i]) {
  // i++;
  // nums[i] = nums[j];
  // }
  // }
  // return i + 1;
  //
  // }
  public int removeDuplicates(int[] nums) {
    int insert = 1;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] != nums[i - 1]) {
        nums[insert] = nums[i];
        insert++;
      }
    }
    return insert;
  }
}
