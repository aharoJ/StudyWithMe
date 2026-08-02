package array;

/**
 * ProductArrayExceptSelf_238
 */
public class ProductArrayExceptSelf_238 {
  public int[] productExceptSelf(int[] nums) {
    // INSERT ANY OF THE 3 METHODS HERE
    return null;
  }

  public int[] constantTime(int[] nums) {
    int n = nums.length;
    int[] result = new int[n];

    // Calculate left product and store in result array
    result[0] = 1;
    for (int i = 1; i < n; ++i) {
      result[i] = nums[i - 1] * result[i - 1];
    }

    // Calculate right product on the fly and multiply with the left product
    int rightProduct = 1;
    for (int i = n - 1; i >= 0; --i) {
      result[i] = result[i] * rightProduct;
      rightProduct *= nums[i];
    }
    return result;
  }

  public int[] linearTime(int[] nums) {
    int n = nums.length;
    int[] left = new int[n];
    int[] right = new int[n];

    left[0] = 1; // populate left to right
    for (int i = 1; i < n; ++i) {
      left[i] = nums[i - 1] * left[i - 1];
    }

    right[n - 1] = 1; // populate right to left
    for (int j = n - 2; j >= 0; --j) {
      right[j] = nums[j + 1] * right[j + 1];
    }

    int[] result = new int[n];
    for (int i = 0; i < n; ++i) {
      result[i] = left[i] * right[i];
    }
    return result;
  }

  public int[] bruteForce(int[] nums) {
    int n = nums.length;
    int[] result = new int[n];
    for (int i = 0; i < n; i++) {
      int product = 1;
      for (int j = 0; j < n; j++) {
        if (i != j) {
          product *= nums[j];
        }
      }
      result[i] = product;
    }
    return result;
  }
}
