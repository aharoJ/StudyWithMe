/**
 * NumbersExample
 */

 public class NumbersExampleRecursion {
  public static void main(String[] args) {
    print(1);
  }

  static void print(int n) {
    // System.out.println(n); // Top-Down e
    if (n <5){
      print(n + 1); // TAIL-RECURSION
    }
    System.out.println(n); // Bottom-Up
  }
}
