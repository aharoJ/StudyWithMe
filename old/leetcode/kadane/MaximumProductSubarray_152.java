package kadane;

/**
 * Input: nums = [2,3,-2,4]
 * Output: 6
 * 
 * Input: nums = [-2,0,-1]
 * Output: 0
 */
public class MaximumProductSubarray_152 {
  public int maxProduct(int[] nums) {
    int sol = nums[0];
    int currentProduct = 1;
    for (int i = 0; i < nums.length; i++) {
      currentProduct *= nums[i];
      sol = Math.max(sol, currentProduct);
      if (currentProduct == 0) {
        currentProduct = 1;
      }
    }

    currentProduct = 1;
    for (int i = nums.length - 1; i >= 0; --i) {
      currentProduct *= nums[i];
      sol = Math.max(sol, currentProduct);
      if (currentProduct == 0) {
        currentProduct = 1;
      }
    }
    return sol;
  }
}
