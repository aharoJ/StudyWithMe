package monotonic;

import java.util.HashMap;
import java.util.Stack;

/**
 * Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
 * Output: [-1,3,-1]
 * 
 * Input: nums1 = [2,4], nums2 = [1,2,3,4]
 * Output: [3,-1]
 */
public class NextGreaterElementI_496 {
  public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    HashMap<Integer, Integer> nextGreaterMap = new HashMap<>();
    Stack<Integer> stack = new Stack<>(); // Stack to track elements while finding the next greater element

    for (int num : nums2) {
      while (!stack.isEmpty() && num > stack.peek()) {
        nextGreaterMap.put(stack.pop(), num); // Map popped element to its next greater element (num)
      }
      stack.push(num); // Push current num onto the stack for future comparison
    }
    while (!stack.isEmpty()) {
      nextGreaterMap.put(stack.pop(), -1); // No next greater element, assign -1
    }

    // look up next greater elements for each element in nums1
    int[] result = new int[nums1.length];
    for (int i = 0; i < nums1.length; i++) {
      result[i] = nextGreaterMap.get(nums1[i]);
    }
    return result;
  }
}
