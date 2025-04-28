import java.util.List;

/**
 * TwoStacksGameChat
 */
public class TwoStacksGameChat {
  public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
    int sum = 0;
    int i = 0; // Pointer for stack A
    int j = 0; // Pointer for stack B
    int count = 0; // Count of elements taken
    int maxCount = 0; // Maximum count of elements

    // Take elements from stack A as much as we can
    while (i < a.size() && sum + a.get(i) <= maxSum) {
      sum += a.get(i);
      i++;
      count++;
    }

    // This is the maximum number of elements we can take from stack A alone
    maxCount = count;

    // Now start taking elements from stack B, and adjust stack A if necessary
    while (j < b.size() && i >= 0) {
      sum += b.get(j);
      j++;
      count++;

      // If sum exceeds maxSum, remove elements from stack A
      while (sum > maxSum && i > 0) {
        i--;
        sum -= a.get(i);
        count--;
      }

      // Update maxCount if a better result is found
      if (sum <= maxSum) {
        maxCount = Math.max(maxCount, count);
      }
    }

    return maxCount;
  }
}
