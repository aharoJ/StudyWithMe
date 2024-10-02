package matrix;

class IslandPerimeter_463 {
  public int islandPerimeter(int[][] grid) {
    int rows = grid.length;
    int cols = grid[0].length;

    int summation = 0;
    for (int r = 0; r < rows; ++r) {
      for (int c = 0; c < cols; c++) {
        if (grid[r][c] == 1) {
          summation += 4;
          if (r > 0 && grid[r - 1][c] == 1) {
            summation -= 2;
          }
          if (c > 0 && grid[r][c - 1] == 1) {
            summation -= 2;
          }
        }
      }
    }
    return summation;
  }

  public static void main(String[] args) {
    IslandPerimeter_463 solution = new IslandPerimeter_463();

    // Test case 1
    int[][] grid1 = {
        { 0, 1, 0, 0 },
        { 1, 1, 1, 0 },
        { 0, 1, 0, 0 },
        { 1, 1, 0, 0 }
    };
    System.out.println("Test case 1: " + solution.islandPerimeter(grid1)); // Expected output: 16

    // Test case 2
    int[][] grid2 = {
        { 1 }
    };
    System.out.println("Test case 2: " + solution.islandPerimeter(grid2)); // Expected output: 4

    // Test case 3
    int[][] grid3 = {
        { 1, 0 }
    };
    System.out.println("Test case 3: " + solution.islandPerimeter(grid3)); // Expected output: 6

  }
}
