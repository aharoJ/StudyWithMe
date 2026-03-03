package practice;

import java.util.ArrayList;
import java.util.List;

/**
 * Increment
 */
public class Increment {
  public static List<Integer> increment(List<Integer> list) {
    List<Integer> incremented = new ArrayList<>();
    for (int i : list) {
      incremented.add(i + 1);
    }
    return incremented;
  }

  public static void main(String[] args) {
    List<Integer> myNumbers = List.of(1, 2, 3, 4, 5);
    List<Integer> incrementedNumbers = increment(myNumbers);
    System.out.println(incrementedNumbers);
  }

}
