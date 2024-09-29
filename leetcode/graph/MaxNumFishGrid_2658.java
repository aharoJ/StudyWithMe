package graph;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Input: grid = [[0,2,1,0],[4,0,0,3],[1,0,0,4],[0,3,2,0]]
 * Output: 7
 */
public class MaximumNumberFishGrid_2658 {
  private int maxFish = 0;
  private final int[][] DIRECTIONS = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

  public int findMaxFish(int[][] grid) {
    int rowsLength = grid.length;
    int colsLength = grid[0].length;
    for (int row = 0; row < rowsLength; ++row) {
      for (int col = 0; col < colsLength; ++col) {
        if (grid[row][col] > 0) {
          int currentSum = dfs(grid, row, col, rowsLength, colsLength);
          // BFS SOLUTION BELOW
          // int currentSum = bfs(grid, row, col, rowsLength, colsLength);
          maxFish = Math.max(maxFish, currentSum); // Correctly update maxFish
        }
      }
    }
    return maxFish;

  }

  private int dfs(int[][] grid, int row, int col, int rowsLength, int colsLength) {
    if (skip(grid, row, col, rowsLength, colsLength)) {
      return 0;
    }
    int temp = grid[row][col];
    grid[row][col] = 0;
    temp += dfs(grid, row + 1, col, rowsLength, colsLength); // down
    temp += dfs(grid, row - 1, col, rowsLength, colsLength); // up
    temp += dfs(grid, row, col + 1, rowsLength, colsLength); // right
    temp += dfs(grid, row, col - 1, rowsLength, colsLength); // left
    return temp;
  }

  private int bfs(int[][] grid, int row, int col, int rowsLength, int colsLength) {
    Queue<int[]> queue = new LinkedList<>();
    queue.offer(new int[] { row, col });
    int temp = 0;
    while (!queue.isEmpty()) {
      int[] point = queue.poll();
      int r = point[0];
      int c = point[1];

      if (skip(grid, r, c, rowsLength, colsLength)) {
        continue;
      }

      temp += grid[r][c];

      grid[r][c] = 0;

      queue.offer(new int[] { r + 1, c }); // down
      queue.offer(new int[] { r - 1, c }); // up
      queue.offer(new int[] { r, c + 1 }); // right
      queue.offer(new int[] { r, c - 1 }); // left
    }
    return temp;
  }

  private boolean skip(int[][] grid, int row, int col, int rowsLength, int colsLength) {
    if (col < 0 || row < 0) {
      return true;
    }
    if (col >= colsLength || row >= rowsLength) {
      return true;
    }
    if (grid[row][col] == 0) {
      return true;
    }
    return false;
  }
}
