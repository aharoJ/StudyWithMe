package dp;

import java.util.HashMap;
import java.util.Map;

/**
 * FibonacciNumber_509
 */
public class FibonacciNumber_509 {
  private Map<Integer, Integer> memo = new HashMap<>();

  public int fib(int n) {
    // INSERT EITHER memoized(n) OR tabulation(n) HERE
    return -1;
  }

  public int tabulation(int n) {
    if (n <= 1) {
      return n;
    }

    int[] cache = new int[n + 1];
    cache[0] = 0;
    cache[1] = 1;
    for (int i = 2; i <= n; ++i) {
      cache[i] = cache[i - 1] + cache[i - 2];
    }
    return cache[n];

  }

  public int memoized(int n) {
    if (n <= 1) {
      return n;
    }
    if (memo.containsKey(n)) {
      memo.get(n);
    }
    int computate = memoized(n - 1) + memoized(n - 2);
    memo.put(n, computate);

    return computate;
  }
}
