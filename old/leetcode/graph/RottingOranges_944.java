package graph;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 0: empty cell,
 * 1: fresh orange
 * 2: rotten orange.
 */
public class RottingOranges_944 {
  private final int[][] DIRECTIONS = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
  private int freshOranges = 0;
  private int minutesToInfect = 0;

  public int orangesRotting(int[][] grid) {
    int rowsLength = grid.length;
    int colsLength = grid[0].length;
    Queue<int[]> queue = new LinkedList<>();
    for (int row = 0; row < rowsLength; ++row) {
      for (int col = 0; col < colsLength; ++col) {
        if (grid[row][col] == 1) {
          freshOranges++;
        }
        if (grid[row][col] == 2) {
          queue.offer(new int[] { row, col });
        }
      }
    }

    if (freshOranges == 0) {
      return 0;
    }

    int check = bfs(grid, queue, rowsLength, colsLength);

    return freshOranges == 0 ? check : -1;
  }

  private int bfs(int[][] grid, Queue<int[]> queue, int rowsLength, int colsLength) {
    while (!queue.isEmpty() && freshOranges > 0) {
      int levelSize = queue.size();
      for (int i = 0; i < levelSize; ++i) {
        int[] point = queue.poll();
        int r = point[0];
        int c = point[1];
        for (int[] direction : DIRECTIONS) {
          int row = r + direction[0];
          int col = c + direction[1];
          if (canInfect(grid, row, col, rowsLength, colsLength)) {
            grid[row][col] = 2;
            freshOranges--;
            queue.offer(new int[] { row, col });
          }
        }
      }
      minutesToInfect++;
    }
    return minutesToInfect;
  }

  private boolean canInfect(int[][] grid, int row, int col, int rowsLength, int colsLength) {
    if (row < 0 || col < 0) {
      return false;
    }
    if (row >= rowsLength || col >= colsLength) {
      return false;
    }
    if (grid[row][col] == 1) {
      return true;
    }
    return false;
  }
}
