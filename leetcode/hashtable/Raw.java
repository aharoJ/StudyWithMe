package hashtable;

import java.util.HashMap;
import java.util.Map;

public class Raw {
  private Map<String, Integer> map;

  public void createMap() {
    map = new HashMap<>();
    map.put("Apple", 3);
    map.put("Oranges", 1);
    map.put("Bananas", 69);
    map.put("Watermelon", 9);
    map.put("Lettuce", 0);
  }

  public void checkDirectly() {
    createMap();
    int num = -1;
    for (int val : map.values()) {
      if (val == 69) {
        num = val;
        break;
      }
    }
    System.out.println("Num: " + num);
  }

  public void checkByGet() {
    createMap();
    int num = -1;
    for (String val : map.keySet()) {
      if (map.get(val) == 69) {
        num = map.get(val);
      }
    }
    System.out.println("Num: " + num);
  }

  public static void main(String[] args) {
    Raw sol = new Raw();
    sol.createMap();

    System.out.println(sol.map.get("Apple")); // This should print: 3
    // sol.checkDirectly();
    sol.checkByGet();
  }
}
