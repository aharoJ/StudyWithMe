import java.util.ArrayList;

/**
 * Permutations
 */
public class Permutations {
  public static void main(String[] args) {
    // permutation("abc", "");

    ArrayList<String> answer = permutationList("abc", "");
    System.out.println(answer);

    // System.out.println(permutationCount("abc", ""));
  }

  static void permutation(String unprocessed, String processed) {
    if (unprocessed.isEmpty()) {
      System.out.println(processed);
      return;
    }

    char ch = unprocessed.charAt(0);
    for (int i = 0; i <= processed.length(); ++i) {
      String first = processed.substring(0, i);
      String second = processed.substring(i, processed.length());
      permutation(unprocessed.substring(1), first + ch + second);
    }
  }

  static ArrayList<String> permutationList(String unprocessed, String processed) {
    ArrayList<String> result = new ArrayList<>();
    if (unprocessed.isEmpty()) {
      result.add(processed);
      return result;
    }

    char ch = unprocessed.charAt(0);
    for (int i = 0; i <= processed.length(); ++i) {
      String first = processed.substring(0, i);
      String second = processed.substring(i, processed.length());
      result.addAll(permutationList(unprocessed.substring(1), first + ch + second));
    }

    return result;
  }

  static int permutationCount(String unprocessed, String processed) {
    if (unprocessed.isEmpty()) {
      return 1;
    }

    char ch = unprocessed.charAt(0);
    int counter = 0;
    for (int i = 0; i <= processed.length(); ++i) {
      String first = processed.substring(0, i);
      String second = processed.substring(i, processed.length());
      counter += permutationCount(unprocessed.substring(1), first + ch + second);
    }

    return counter;
  }
}
