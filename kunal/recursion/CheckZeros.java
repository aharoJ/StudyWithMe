/**
 * CheckZeros
 */
public class CheckZeros {
  public static void main(String[] args) {
    // int method1 = check1(302041010);
    // System.out.println(method1);

    int method2 = check2(302041010);
    System.out.println(method2);
  }

  static int check1(int n) {
    if (n == 0) {
      return 0;
    }
    int remainder = n % 10;
    int counter = 0;
    if (remainder == 0) {
      counter++;
    }
    return counter + check1(n / 10);
  }

  static int check2(int n) {
    return helper(n, 0);
  }

  static int helper(int n, int counter) {
    if (n == 0) {
      return counter;
    }

    if (n % 10 == 0) {
      return helper(n, counter++);
    }
    return helper(n, counter);

  }
}
