package simulation;

import java.util.HashMap;
import java.util.Map;

/**
 * RobotReturnOrigin_657
 */
public class RobotReturnOrigin_657 {
  public boolean judgeCircle(String moves) {
    // INSERT METHOD APPROACH HERE

    return false;
  }

  public boolean usingConditional(String moves) {
    int x = 0;
    int y = 0;
    for (char move : moves.toCharArray()) {
      if (move == 'U') {
        x += 1;
      }
      if (move == 'D') {
        x -= 1;
      }
      if (move == 'R') {
        y += 1;
      }
      if (move == 'L') {
        y -= 1;
      }
    }
    return x == 0 && y == 0;
  }

  public boolean usingMap(String moves) {
    Map<Character, int[]> map = myMap();

    int x = 0;
    int y = 0;
    for (char move : moves.toCharArray()) {
      int[] axis = map.get(move);
      x += axis[0];
      y += axis[1];
    }

    if (x == 0 && y == 0) {
      return true;
    }
    return false;
  }

  private Map<Character, int[]> myMap() {
    Map<Character, int[]> map = new HashMap<>();
    map.put('U', new int[] { 0, 1 });
    map.put('D', new int[] { 0, -1 });
    map.put('R', new int[] { 1, 0 });
    map.put('L', new int[] { -1, 0 });
    return map;
  }
}
