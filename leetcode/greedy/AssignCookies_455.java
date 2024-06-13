package greedy;

import java.util.Arrays;

/**
 * AssignCookies_455
 */
public class AssignCookies_455 {
  public int findContentChildren(int[] g, int[] s) {
    Arrays.sort(g);
    Arrays.sort(s);
    int l = g.length - 1;
    int r = s.length - 1;
    int counter = 0;
    while (l >= 0 && r >= 0) {
      if (s[r] >= g[l]) {
        r--;
        counter++;
      }
      l--;
    }
    return counter;
  }
}
