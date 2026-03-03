package prefixsum;

import java.util.HashMap;
import java.util.Map;

/**
 * SubarraySumEqualsK_560
 */
public class SubarraySumEqualsK_560 {

  public int subarraySum(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    map.put(0, 1); // for the case when sum-k=0
    int count = 0;
    int sum = 0;
    for (int num : nums) {
      sum += num;
      if (map.containsKey(sum - k)) {
        count += map.get(sum - k);
      }
      int freq = map.getOrDefault(sum, 0);
      map.put(sum, freq + 1);
    }
    return count;
  }

  // brute force solution
  public int subarraySumBF(int[] nums, int k) {
    int count = 0;
    for (int i = 0; i < nums.length; ++i) {
      int sum = 0;
      for (int j = i; j < nums.length; ++j) {
        sum += nums[j];
        if (sum == k) {
          count++;
        }
      }
    }
    return count;
  }
}
