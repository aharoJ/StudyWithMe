/**
 * Sol
 */
public class DigitSum {
  public static void main(String[] args) {
    int answer= sumOfDigits(1342);
    System.out.println(answer);
  }

  static int sumOfDigits(int n) {
    if (n <= 0) {
      return 0;
    }
    return (n%10) +  sumOfDigits(n/10);
  }

}
