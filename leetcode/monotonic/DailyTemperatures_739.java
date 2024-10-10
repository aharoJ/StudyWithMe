package monotonic;

import java.util.Stack;

/**
 * Input: temperatures = [73,74,75,71,69,72,76,73]
 * Output: [1,1,4,2,1,1,0,0]
 * 
 * Input: temperatures = [30,40,50,60]
 * Output: [1,1,1,0]
 */
public class DailyTemperatures_739 {
  public int[] dailyTemperatures(int[] temperatures) {
    Stack<Integer> stack = new Stack<>();
    int n = temperatures.length;
    int[] result = new int[n];

    for (int i = 0; i < n; ++i) {
      // current temperature is greater than the temperature at stack's top index
      while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
        int prevDay = stack.pop(); // Get the index of the previous cooler day
        result[prevDay] = i - prevDay; // Calculate the number of days to wait (difference of indices)
      }
      stack.push(i); // Push the current day's index onto the stack
    }
    return result; // Return the result array
  }
}
