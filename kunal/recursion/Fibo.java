
/**
 * Fibo
 */
public class Fibo {
  public static void main(String[] args) {
    int ans = Fibo(50);
    System.out.println(ans);
  }

  static int Fibo(int n) {
    if (n <= 1) {
      return n;
    }
    return Fibo(n - 1) + Fibo(n - 2);
  }
}
