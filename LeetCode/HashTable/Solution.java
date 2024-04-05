package HashTable;

import java.util.HashMap;
import java.util.Map;

/**
 * Example 1:
 * Input: nums = [1,2,2,4]
 * Output: [2,3]
 *
 * Example 2:
 * Input: nums = [1,1]
 * Output: [1,2]
 */
public class Solution {
    public int[] findErrorNums(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int val : nums) {
            int freq = map.getOrDefault(val, 0);
            map.put(val, freq + 1);
        }

        int duplicate = Integer.MIN_VALUE;
        int missing = Integer.MIN_VALUE;
        for (int i = 1; i <= nums.length; ++i) {
            if (map.containsKey(i)) {
                if (map.get(i) == 2) {
                    duplicate = i;
                }
            } else {
                missing = i;
            }
        }
        return new int[] { duplicate, missing };
    }
}
