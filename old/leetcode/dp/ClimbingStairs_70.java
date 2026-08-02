package dp;

import java.util.HashMap;
import java.util.Map;

/**
 */
public class ClimbingStairs_70 {
  private Map<Integer, Integer> memo = new HashMap<>(
      Map.of(0, 0, 1, 1));

  public int climbStairs(int n) {
    // INSERT EITHER memoized(n) OR tabulation(n) HERE
    return -1;
  }

  public int tabulazation(int n) {
    if (n <= 1) {
      return n;
    }
    int[] cache = new int[n + 1];
    cache[0] = 0;
    cache[1] = 1;
    cache[2] = 2;
    for (int i = 3; i <= n; ++i) {
      cache[i] = cache[i - 1] + cache[i - 2];
    }
    return cache[n];
  }

  public int memoized(int n) {
    if (n <= 2) {
      return n;
    }
    if (memo.containsKey(n)) {
      return memo.get(n);
    }

    int computate = memoized(n - 1) + memoized(n - 2);
    memo.put(n, computate);

    return computate;
  }
}
