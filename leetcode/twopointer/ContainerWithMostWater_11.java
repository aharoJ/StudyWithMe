package twopointer;

/**
 * ContainerWithMostWater_11
 */
public class ContainerWithMostWater_11 {
  public int maxArea(int[] height) {
    int sol = 0;
    int left = 0;
    int right = height.length - 1;
    while (left < right) {

      int width = right - left;
      int h = Math.min(height[left], height[right]);
      int area = width * h;
      sol = Math.max(sol, area);
      if (height[left] < height[right]) {
        left++;
      } else {
        right--;
      }
    }
    return sol;
  }
}
