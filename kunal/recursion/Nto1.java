/**
 * Nto1
 */
public class Nto1 {
  public static void main(String[] args) {
    System.out.println("-------- TOP-down ---------");
    topDown(5);
    System.out.println("--------- BOTTOM-up --------");
    bottomUp(5);
  }

  static void topDown(int n) { // seems to be the way of recursion
    if (n == 0) {
      return;
    }
    topDown(n - 1); // Recurse with n-1 first (going deeper)
    System.out.println(n); // Print after recursion (as you unwind)
  }

  static void bottomUp(int n) {
    if (n == 0) {
      return;
    }
    System.out.println(n); // Print before recursion (as you go deeper)
    bottomUp(n - 1); // Recurse with n-1 afterward
  }

}
