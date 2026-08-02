package matrix;

/**
 * To flip:
 * - an image horizontally means that each row of the image is reversed.
 * For example, flipping [1,1,0] horizontally results in [0,1,1].
 *
 * To invert:
 * - an image means that each 0 is replaced by 1, and each 1 is replaced
 * by 0.
 * For example, inverting [0,1,1] results in [1,0,0].
 */
public class FlippingImage_832 {
  public int[][] flipAndInvertImage(int[][] image) {
    int n = image.length;
    for (int[] row : image) {
      flip(row);
      invert(row);
    }
    return image;
  }

  static void flip(int[] nums) {
    int left = 0;
    int right = nums.length - 1;
    while (left < right) {
      int temp = nums[left];
      nums[left] = nums[right];
      nums[right] = temp;
      left++;
      right--;
    }
  }

  static void invert(int[] nums) {
    for (int i = 0; i < nums.length; ++i) {
      if (nums[i] == 0) {
        nums[i] = 1;
      } else if (nums[i] == 1) {
        nums[i] = 0;
      }
    }
  }
}
