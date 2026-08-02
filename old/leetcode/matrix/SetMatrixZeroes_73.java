package matrix;

import java.util.HashSet;
import java.util.Set;

/**
 * SetMatrixZeroes_73
 */
public class SetMatrixZeroes_73 {
  public void setZeroes(int[][] matrix) {
    int R = matrix.length;
    int C = matrix[0].length;

    Set<Integer> set_r = new HashSet<>();
    Set<Integer> set_c = new HashSet<>();
    for (int i = 0; i < R; ++i) {
      for (int j = 0; j < C; ++j) {
        if (matrix[i][j] == 0) {
          set_r.add(i);
          set_c.add(j);
        }
      }
    }

    for (int i = 0; i < R; ++i) {
      for (int j = 0; j < C; ++j) {
        if (set_r.contains(i) || set_c.contains(j)){
          matrix[i][j]=0;
        }
      }
    }

  }
}
