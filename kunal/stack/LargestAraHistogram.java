import java.util.Stack;

/**
 * LargestAraHistogram
 */
public class LargestAraHistogram {
  public static void main(String[] args) {
    int[] heights1 = { 2, 1, 5, 6, 2, 3 };
    // Test case 1
    System.out.println("Test case 1:");
    System.out.println("Heights: [2, 1, 5, 6, 2, 3]");
    System.out.println("Largest Rectangle Area: " + largestRectangleArea(heights1)); // Expected: 10
  }

  static int largestRectangleArea(int[] heights) {
    Stack<Integer> stack = new Stack<>();
    int max = 0;
    stack.push(0);

    for (int i = 1; i < heights.length; ++i) {
      while (!stack.isEmpty() && heights[i] < heights[stack.peek()]) {
        max = getMax(heights, stack, max, i);
      }
      stack.push(i);
    }

    int i = heights.length;
    while (stack.isEmpty()) {
      max = getMax(heights, stack, max, i);
    }
    return max;
  }

  private static int getMax(int[] heights, Stack<Integer> stack, int max, int i) {
    int area = 0;
    int popped = stack.pop();

    if (stack.isEmpty()) {
      area = heights[popped] * i;
    } else {
      area = heights[popped] * (i - 1 - stack.peek());
    }
    return Math.max(max, area);
  }

}
