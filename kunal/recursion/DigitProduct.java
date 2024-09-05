/**
 * Sol
 */
public class DigitProduct {
  public static void main(String[] args) {
    int answer = productOfDigits(1342);
    System.out.println(answer);
  }

  static int productOfDigits(int n) {
    if ( n % 10 == n) {
      return n;
    }
    return (n % 10) * productOfDigits(n / 10);
  }

}
