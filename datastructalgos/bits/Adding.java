package datastructalgos.bits;

/**
 * Adding
 */
public class Adding {
  public String addBinary(String a, String b) {
    StringBuilder sb = new StringBuilder();
    int i = a.length() - 1;
    int j = b.length() - 1;
    int carry = 0;

    System.out.println("Initial State:");
    System.out.println("a: " + a + ", b: " + b);
    System.out.println("i: " + i + ", j: " + j + ", carry: " + carry);
    System.out.println("---------------");

    while (i >= 0 || j >= 0) {
      int sum = carry;
      System.out.println("Start of loop:");
      System.out.println("sum (carry): " + sum);

      if (i >= 0) {
        sum += a.charAt(i) - '0';
        System.out.println("Added a[" + i + "] (" + a.charAt(i) + ") to sum: " + sum);
      }
      if (j >= 0) {
        sum += b.charAt(j) - '0';
        System.out.println("Added b[" + j + "] (" + b.charAt(j) + ") to sum: " + sum);
      }

      sb.append(sum % 2);
      System.out.println("Appended to result: " + (sum % 2));
      carry = sum / 2;
      System.out.println("New carry: " + carry);

      i--;
      j--;
      System.out.println("Decremented i and j: i=" + i + ", j=" + j);
      System.out.println("Current result (reversed): " + sb.toString());
      System.out.println("---------------");
    }

    if (carry != 0) {
      sb.append(carry);
      System.out.println("Appended final carry: " + carry);
    }

    String result = sb.reverse().toString();
    System.out.println("Final reversed result: " + result);
    return result;
  }

  public static void main(String[] args) {
    Adding solution = new Adding();
    String a = "1010";
    String b = "1011";

    System.out.println("Input: a = " + a + ", b = " + b);
    String result = solution.addBinary(a, b);
    System.out.println("Output: " + result);
  }
}
