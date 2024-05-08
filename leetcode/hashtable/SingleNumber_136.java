package hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * Example 1:
 * Input: nums = [2,2,1]
 * Output: 1
 * 
 * Example 2:
 * Input: nums = [4,1,2,1,2]
 * Output: 4
 * 
 * Example 3:
 * Input: nums = [1]
 * Output: 1
 */
@SuppressWarnings("unused") // Nvim  
public class SingleNumber_136 {

  public int singleNumber(int[] nums) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int val : nums) {
      int freq = map.getOrDefault(val, 0);
      map.put(val, freq + 1);
    }

    int unique_num = -1;
    for (int key_freq : map.keySet()) {
      if (map.get(key_freq) == 1) {
        unique_num = key_freq;
      }
    }
    return unique_num;

  }
}
