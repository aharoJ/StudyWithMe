package graph;

import java.util.LinkedList;
import java.util.Queue;

/**
 * WallsGates_286
 */
public class WallsGates_286 {
  private static final int EMPTY = 2147483647; // Representing INF
  private static final int GATE = 0;
  private static final int WALL = -1;
  private static final int[][] DIRECTIONS = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

  public void wallsAndGates(int[][] rooms) {
    if (rooms.length == 0 || rooms == null) {
      return;
    }
    Queue<int[]> queue = new LinkedList<>();

    int rowsLength = rooms.length;
    int colsLenght = rooms[0].length;
    for (int row = 0; row < rowsLength; ++row) {
      for (int col = 0; col < colsLenght; ++col) {
        if (rooms[row][col] == GATE) {
          queue.offer(new int[] { row, col });
        }
      }
    }
    while (!queue.isEmpty()) {
      int[] point = queue.poll();
      int row = point[0];
      int col = point[1];
      for (int[] direction : DIRECTIONS) {
        int r = row + direction[0];
        int c = col + direction[1];
        rooms[r][c] = rooms[row][col] + 1;

        queue.offer(new int[] { r, c });
      }
    }
  }

  boolean skip(int[][] matrix, int row, int col, int rowsLength, int colsLength) {
    if (row < 0 || col < 0) {
      return true;
    }
    if (row >= rowsLength || col >= colsLength) {
      return true;
    }
    if (matrix[row][col] != EMPTY) {
      return true;
    }
    return false;
  }
}
