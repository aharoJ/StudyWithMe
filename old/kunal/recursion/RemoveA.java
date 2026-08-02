/**
 * RemoveA
 */
public class RemoveA {
  public static void main(String[] args) {
    System.out.println("------- recursively O(n) -------");
    String str = "baccad";
    System.out.println(removeLetterA(str));

    System.out.println("------- substring recursively -------");
    usingSubstring("", "baccad");

    System.out.println("------- substring skip apple -------");
    String result = skipApple("brtappleio");
    System.out.println(result); //

    System.out.println("------- substring skip app but NOT apple -------");

    String appButNotApple = skipAppNotApple("brsappzzapple");
    System.out.println(appButNotApple); //
  }

  static String removeLetterA(String str) {
    return helper(str, 0);
  }

  static String helper(String str, int i) {
    if (str.length() == i) {
      return ""; // When at the end, return an empty string
    }
    char current_char = str.charAt(i);
    if (current_char == 'a') {
      return helper(str, i + 1); // Skip 'a'
    } else {
      return current_char + helper(str, i + 1); // Include non-'a' characters
    }
  }

  static void usingSubstring(String process, String up) {
    if (up.isEmpty()) {
      System.out.println(process);
      return;
    }
    char c = up.charAt(0);
    if (c == 'a') {
      usingSubstring(process, up.substring(1));
    } else {
      usingSubstring(process + c, up.substring(1));
    }
  }

  static String skipApple(String up) {
    if (up.isEmpty()) {
      return "";
    }
    if (up.startsWith("apple")) {
      return skipApple(up.substring(5));
    } else {
      return up.charAt(0) + skipApple(up.substring(1));
    }
  }

  static String skipAppNotApple(String up) {
    if (up.isEmpty()) {
      return "";
    }
    if (up.startsWith("app") && !up.startsWith("apple")) {
      return skipAppNotApple(up.substring(3));
    } else {
      return up.charAt(0) + skipAppNotApple(up.substring(1));
    }
  }
}
