/**
 * SubSequence
 */
public class SubSequence {
  public static void main(String[] args) {
    // Call the function with an example input string "abc"
    // subsequence("", "abc");
    subSequenceUsingIndex("abc", "", 0);
  }

  // Function to print all subsequences of a given string
  static void subsequence(String processed, String unprocessed) {
    // Base case: if the unprocessed string is empty, print the processed part
    if (unprocessed.isEmpty()) {
      System.out.println(processed);
      return;
    }

    // Get the first character of the unprocessed string
    char currentChar = unprocessed.charAt(0);

    // Recursive call 1: Include the current character in the processed part
    subsequence(processed + currentChar, unprocessed.substring(1));

    // Recursive call 2: Exclude the current character from the processed part
    subsequence(processed, unprocessed.substring(1));
  }
  
  static void subSequenceUsingIndex(String unprocessed, String processed, int index) {
    if (index == unprocessed.length()) {
      // Base case: print the processed string when we reach the end of the
      // unprocessed string
      System.out.println(processed);
      return;
    }

    char currentChar = unprocessed.charAt(index);

    // Option 1: Include the current character
    subSequenceUsingIndex(unprocessed, processed + currentChar, index + 1);

    // Option 2: Exclude the current character
    subSequenceUsingIndex(unprocessed, processed, index + 1);
  }
}
