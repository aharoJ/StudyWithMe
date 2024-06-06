package greedy;

/**
 * AssignCookies_455
 */
public class AssignCookies_455 {
  public int findContentChildren(int[] g, int[] s) {
    Arrays.sort(g);
    Arrays.sort(s);
    int children = 0;
    int cookies = 0;
    int happy = 0;

    while (children < g.length && cookies < s.length) {
      if (s[cookies] >= g[children]) {
        happy++;
        children++;
        cookies++;
      } else {
        cookies++;
      }
    }
    return happy;
  }
}
