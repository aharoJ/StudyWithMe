package leetcode.array;

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
public class SingleNumber_136 {
  public int singleNumber(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int val : nums) {
      int freq = map.getOrDefault(val, 0);
      map.put(val, freq + 1);
    }
    int uniqueNum=0;
    for (int val : nums) {
      if (map.get(val) == 1) {
        uniqueNum= val;
      }
    }
    return uniqueNum;
  }
  //
  //
  //
  //
  //
  //
  //
  //
  //
  //
  //
  //
  //
  //

  // public int singleNumber(int[] nums) {
  // int k = Integer.MAX_VALUE;
  // for (int i = 1; i < nums.length; i++) {
  // if (nums[i] != nums[i - 1]) {
  // k = nums[i];
  // }
  // }
  // return k;
  // }
}
