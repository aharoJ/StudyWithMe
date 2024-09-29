package graph;

/**
 * NumberIslands_200
 */
public class NumberIslands_200 {
  private int islands = 0;

  public int numIslands(char[][] grid) {
    int rowLength = grid.length;
    int colLength = grid[0].length;
    for (int row = 0; row < rowLength; ++row) {
      for (int col = 0; col < colLength; ++col) {
        if (grid[row][col] == '1') {
          dfs(grid, row, col, rowLength, colLength);
          islands++;
        }
      }
    }
    return islands;
  }

  private void dfs(char[][] grid, int row, int col, int rowLength, int colLength) {
    if (row < 0 || col < 0) {
      return;
    }
    if (row >= rowLength || col >= colLength) {
      return;
    }
    if (grid[row][col] == '0') {
      return;
    }
    // tagg current point
    grid[row][col] = '0';
    dfs(grid, row + 1, col, rowLength, colLength); // down
    dfs(grid, row - 1, col, rowLength, colLength); // up
    dfs(grid, row, col + 1, rowLength, colLength); // right
    dfs(grid, row, col - 1, rowLength, colLength); // left
  }
}
