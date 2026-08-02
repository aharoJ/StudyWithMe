package matrix;

/**
 * Example 1:
 * Input: accounts = [[1,2,3],[3,2,1]]
 * Output: 6
 * 
 * Example 3:
 * Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
 * Output: 17
 */
public class RichestCustomerWealth_1672 {
  public int maximumWealth(int[][] accounts) {
    int customerWithHighestBread = 0;
    for (int i = 0; i < accounts.length; ++i) {
      int current = 0;
      for (int j = 0; j < accounts[i].length; ++j) {
        current += accounts[i][j];
        if (current > customerWithHighestBread) {
          customerWithHighestBread = current;
        }
      }
    }
    return customerWithHighestBread;
  }
}
