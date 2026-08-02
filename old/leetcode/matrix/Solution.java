package matrix;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * class Solution {
 * public int[][] flipAndInvertImage(int[][] image) {
 * 
 * }
 * }
 */
@SuppressWarnings("unused") // Nvim
class Solution {
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
      nums[right] = left;
      left++;
      right--;
    }
  }

  static void invert(int[] nums) {
    for (int i = 0; i < nums.length; ++i) {
      if (nums[i] == 0) {
        nums[i] = 1;
      }
      if (nums[i] == 1) {
        nums[i] = 0;
      }
    }
  }
}
