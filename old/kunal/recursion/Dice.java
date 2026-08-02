import java.util.ArrayList;
import java.util.List;

/**
 * Dice
 */
public class Dice {
  public static void main(String[] args) {
    // List<String> answer = dice("", 4);
    // System.out.println(answer);

    List<String> Nthrows = diceNThrows("", 4, 2, 6); // 2 dice, 6 faces, target = 4
    System.out.println(Nthrows);
  }

  static List<String> dice(String processed, int target) {
    List<String> result = new ArrayList<>();
    if (target == 0) {
      result.add(processed);
      return result;
    }
    for (int i = 1; i <= 6 && i <= target; ++i) {
      result.addAll(dice(processed + i, target - i));
    }
    return result;
  }

  static List<String> diceCustomFace(String processed, int target, int face) {
    List<String> result = new ArrayList<>();
    if (target == 0) {
      result.add(processed);
      return result;
    }
    for (int i = 1; i <= face && i <= target; ++i) {
      result.addAll(diceCustomFace(processed + i, target - i, face));
    }
    return result;
  }

  static List<String> diceNThrows(String processed, int target, int n, int face) {
    List<String> result = new ArrayList<>();

    // Base case: If target is 0 and we used exactly n dice, add the processed
    // string
    if (target == 0 && n == 0) {
      result.add(processed);
      return result;
    }

    // Base case: If no dice are left but the target is not yet reached, return
    // empty
    if (n == 0 || target < 0) {
      return result;
    }

    // Try all dice face values (from 1 to 'face')
    for (int i = 1; i <= face && i <= target; ++i) {
      // Recursively reduce the target and dice count, and append the current face (i)
      // to processed
      result.addAll(diceNThrows(processed + i, target - i, n - 1, face));
    }
    return result;
  }
}
