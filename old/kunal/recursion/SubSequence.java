import java.util.ArrayList;
import java.util.List;

/**
 * SubSequence
 */
public class SubSequence {
  public static void main(String[] args) {
    // Call the function with an example input string "abc"
    // System.out.println("------------------substring---------------------------");
    // subsequence("abc", "");
    
    // System.out.println("-------------------index--------------------------");
    // subsequenceWithIndex("abc", "", 0);
    
    // ArrayList<String> result = subsequenceListWithIndex("abc", "", 0);
    // System.out.println(result); // Print all subsequences
    
    subsequenceASCII("abc", "", 0);

    System.out.println("---------------------------------------------");
  }

  // Function to print all subsequences of a given string
  static void subsequence(String unprocessed, String processed) {
    // Base case: if the unprocessed string is empty, print the processed part
    if (unprocessed.isEmpty()) {
      System.out.println(processed);
      return;
    }

    // Get the first character of the unprocessed string
    char current_char = unprocessed.charAt(0);

    // Recursive call 1: Include the current character in the processed part
    subsequence(unprocessed.substring(1), processed + current_char);

    // Recursive call 2: Exclude the current character from the processed part
    subsequence(unprocessed.substring(1), processed);
  }

  static void subsequenceWithIndex(String unprocessed, String processed, int index) {
    // Base case: check if the index has reached the length of the string
    if (index == unprocessed.length()) {
      System.out.println(processed);
      return;
    }

    // Get the current character using the index
    char current_char = unprocessed.charAt(index);

    // Option 1: Include the current character
    subsequenceWithIndex(unprocessed, processed + current_char, index + 1);

    // Option 2: Exclude the current character
    subsequenceWithIndex(unprocessed, processed, index + 1);
  }

  static ArrayList<String> subsequenceListWithIndex(String unprocessed, String processed, int index) {
    ArrayList<String> result = new ArrayList<>();
    if (index == unprocessed.length()) {
      result.add(processed);
      return result;
    }

    char current_char = unprocessed.charAt(index);
    result.addAll(subsequenceListWithIndex(unprocessed, processed + current_char, index + 1));
    result.addAll(subsequenceListWithIndex(unprocessed, processed, index + 1));

    return result;
  }

  static void subsequenceASCII(String unprocessed, String processed, int index) {
    if (index == unprocessed.length()) {
      System.out.println(processed);
      return;
    }

    char current_char = unprocessed.charAt(index);
    subsequenceASCII(unprocessed, processed + current_char, index + 1);
    subsequenceASCII(unprocessed, processed, index + 1);
    subsequenceASCII(unprocessed, processed + (int) current_char, index + 1);
  }

}
