package matrix;

/**
 * LargestLocalValuesMatrix_2373
 */
public class LargestLocalValuesMatrix_2373 {
  public int[][] largestLocal(int[][] grid) {
    int[][] maxFound = new int[grid.length - 2][grid.length - 2];
    for (int i = 0; i <= grid.length - 3; i++) {
      for (int j = 0; j <= grid.length - 3; ++j) {
        int maxLocal = grid[i][j];

        for (int x = i; x < i + 3; ++x) {
          for (int y = j; y < j + 3; ++y) {
            if (grid[x][y] > maxLocal) {
              maxLocal = grid[x][y];
            }
          }
        }
        maxFound[i][j] = maxLocal;
      }
    }
    return maxFound;
  }

}
