package linkedlist;

/**
 * Input: nums = [1,3,4,2,2]
 * Output: 2
 * 
 * Input: nums = [3,1,3,4,2]
 * Output: 3
 *
 * same concept as happy number
 */
public class FindDuplicateNumber_287 {
  public int findDuplicate(int[] nums) {
    // Step 1: Use Floyd's Tortoise and Hare algorithm to detect the cycle
    int slow = nums[0];
    int fast = nums[0];

    // Move slow by 1 step and fast by 2 steps until they meet
    do {
      slow = nums[slow];
      fast = nums[nums[fast]];
    } while (slow != fast);

    // Step 2: Find the start of the cycle (the duplicate number)
    int pointer1 = nums[0];
    int pointer2 = slow; // Start at the intersection point

    // Move both pointers one step at a time until they meet
    while (pointer1 != pointer2) {
      pointer1 = nums[pointer1];
      pointer2 = nums[pointer2];
    }

    // The meeting point is the duplicate number
    return pointer1;
  }
}
