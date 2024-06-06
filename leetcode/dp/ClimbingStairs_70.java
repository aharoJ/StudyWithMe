package dp;

/**
 */
public class ClimbingStairs_70 {
  public int climbStairs(int n) {
    int[] dp = new int[n + 1];
    dp[1] = 1;
    dp[2] = 1;
    for (int i = 3; i <= n; ++i) {
      dp[i] = dp[i - 1] + dp[i - 2];
    }
    return dp[n];
  }

  public static void main(String[] args) {
    ClimbingStairs_70 obj = new ClimbingStairs_70();
    System.out.println(obj.climbStairs(2));
    System.out.println(obj.climbStairs(3));
    System.out.println(obj.climbStairs(4));
    System.out.println(obj.climbStairs(5));
  }
}
