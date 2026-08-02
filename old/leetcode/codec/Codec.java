import java.util.LinkedList;
import java.util.List;

/**
 * Codec
 */
public class Codec {
  final char DELIMITER = '#';

  public String encode(List<String> strs) {
    StringBuilder sb = new StringBuilder();
    for (String str : strs) {
      sb.append(str.length());
      sb.append(DELIMITER);
      sb.append(str);
    }
    return sb.toString();
  }

  public List<String> decode(String s) {
    List<String> res = new LinkedList<>();
    char[] arr = s.toCharArray();
    for (int i = 0; i < arr.length; i++) {
      // Find the number of characters
      StringBuilder sb = new StringBuilder();
      while (arr[i] != DELIMITER) {
        sb.append(arr[i++]);
      }
      i++; // Skip the delimiter

      // Convert the number of characters
      int numOfChars = Integer.valueOf(sb.toString());
      int end = i + numOfChars;

      sb = new StringBuilder();
      while (i < end) {
        sb.append(arr[i++]);
      }
      i--; // Adjust index after the loop

      // Add the decoded string to the result list
      res.add(sb.toString());
    }
    return res;
  }
}
