package dp;

import java.util.HashMap;
import java.util.Map;

/**
 */
public class MinCostClimbingStairs_746 {
class Solution {
  private Map<Integer, Integer> memo = new HashMap<>();

  public int minCostClimbingStairs(int[] cost) {
    // INSERT EITHER memoized(n) OR tabulation(n) HERE
    return -1;
  }

  public int tabulation(int[] cost) {
    int n = cost.length;
    if (n == 0 || cost == null) {
      return 0;
    }

    int[] cache = new int[cost.length + 1];
    cache[0] = cost[0];
    cache[1] = cost[1];
    for (int i = 2; i < cost.length; ++i) {
      cache[i] = cost[i] + Math.min(cache[i - 1], cache[i - 2]);
    }
    return Math.min(cache[n - 1], cache[n - 2]);
  }

  public int memoized(int[] cost) {
    int n = cost.length;
    int step = helper(cost, n - 1);
    int twostep = helper(cost, n - 2);

    return Math.min(step, twostep);
  }

  private int helper(int[] cost, int i) {
    if (i <= 1) {
      return cost[i]; // populate step and twostep
    }

    if (memo.containsKey(i)) {
      return memo.get(i);
    }

    int step = helper(cost, i - 1);
    int twostep = helper(cost, i - 2);

    int computate = cost[i] + Math.min(step, twostep);

    memo.put(i, computate);

    return computate;
  }
}
