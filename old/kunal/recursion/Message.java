/**
 * Main
 */
public class Message {
  public static void main(String[] args) {
    hello(1);
  }

  static void hello(int number) {
    System.out.println("Hello!");

    if (number < 5) {
      hello(number + 1); // Recursively call hello with incremented number
    }
  }

}
