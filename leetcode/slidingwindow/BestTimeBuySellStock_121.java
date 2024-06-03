package slidingwindow;

/*
Input: prices = [7,1,5,3,6,4]
Output: 5
 */
public class BestTimeBuySellStock_121 {
  public int maxProfit(int[] prices) {
    int left = 0, right = 1, max = 0;
    while (right < prices.length) {
      if (prices[left] > prices[right]) {
        left = right; // skip cuz we want a smaller val
      } else if (prices[left] < prices[right]) {
        max = Math.max((prices[right] - prices[left]), max);
      }
      right++;
    }
    return max;
  }

  public static void main(String[] args) {
    BestTimeBuySellStock_121 solution = new BestTimeBuySellStock_121();
    int[] prices = { 7, 2, 3, 1, 5, 6, 4 };
    System.out.println("Maximum Profit: " + solution.maxProfit(prices));
  }
}
