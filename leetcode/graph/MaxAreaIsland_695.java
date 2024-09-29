package graph;

/**
 * MaxAreaIsland_695
 */
public class MaxAreaIsland_695 {
  private int maxArea = 0;

  public int maxAreaOfIsland(int[][] grid) {
    int rowLength = grid.length;
    int colLength = grid[0].length;
    for (int row = 0; row < rowLength; ++row) {
      for (int col = 0; col < colLength; ++col) {
        if (grid[row][col] == 1) {
          int currentArea = dfs(grid, row, col, rowLength, colLength);
          maxArea = Math.max(maxArea, currentArea);
        }
      }
    }
    return maxArea;
  }

  private int dfs(int[][] grid, int row, int col, int rowLength, int colLength) {
    if (row < 0 || col < 0) {
      return 0;
    }
    if (row >= rowLength || col >= colLength) {
      return 0;
    }
    if (grid[row][col] == 0) {
      return 0;
    }

    grid[row][col] = 0;

    int area = 1;
    area += dfs(grid, row + 1, col, rowLength, colLength); // down
    area += dfs(grid, row - 1, col, rowLength, colLength); // up
    area += dfs(grid, row, col + 1, rowLength, colLength); // right
    area += dfs(grid, row, col - 1, rowLength, colLength); // left

    return area;
  }
}
