package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 */
@SuppressWarnings("unused") // Nvim
class Solution {
  public List<String> summaryRanges(int[] nums) {
    List<String> list = new ArrayList<>();

    for (int i = 0; i < nums.length; i++) {
      int pointer = nums[i];
      while (i + 1 < nums.length && nums[i] + 1 == nums[i + 1]) {
        ++i;
      }

      if (pointer != nums[i]) {
        list.add(pointer + "->" + nums[i]);
      } else {
        list.add(String.valueOf(pointer));
      }
    }

    return list;
  }
}
