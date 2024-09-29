package graph;

/**
 * 1: water
 * 0: land
 */
public class NumberClosedIslands_1254 {
  private int count = 0;

  public int closedIsland(int[][] grid) {
    int rowsLength = grid.length;
    int colsLength = grid[0].length;

    for (int row = 0; row < rowsLength; ++row) {
      for (int col = 0; col < colsLength; ++col) {
        if (edges(grid, row, col, rowsLength, colsLength) && grid[row][col] == 0) {
          dfs(grid, row, col, rowsLength, colsLength);
        }
      }
    }

    for (int row = 0; row < rowsLength; ++row) {
      for (int col = 0; col < colsLength; ++col) {
        if (grid[row][col] == 0) {
          dfs(grid, row, col, rowsLength, colsLength);
          count++;
        }
      }
    }
    return count;
  }

  private void dfs(int[][] grid, int row, int col, int rowsLength, int colsLength) {
    if (skip(grid, row, col, rowsLength, colsLength)) {
      return;
    }

    grid[row][col] = 1; // mark with water

    dfs(grid, row + 1, col, rowsLength, colsLength); // down
    dfs(grid, row - 1, col, rowsLength, colsLength); // up
    dfs(grid, row, col + 1, rowsLength, colsLength); // right
    dfs(grid, row, col - 1, rowsLength, colsLength); // left
  }

  private boolean skip(int[][] grid, int row, int col, int rowsLength, int colsLength) {
    if (col < 0 || row < 0) {
      return true;
    }
    if (col >= colsLength || row >= rowsLength) {
      return true;
    }
    if (grid[row][col] == 1) {
      return true;
    }
    return false;
  }

  private boolean edges(int[][] grid, int row, int col, int rowsLength, int colsLength) {
    if (row == 0 || col == 0) {
      return true;
    }

    if (row == rowsLength - 1 || col == colsLength - 1) {
      return true;
    }
    return false;
  }
}
