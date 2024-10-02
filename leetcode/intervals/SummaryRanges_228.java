package intervals;

import java.util.ArrayList;
import java.util.List;

/**
 * Input: nums = [0,1,2,4,5,7]
 * Output: ["0->2","4->5","7"]
 */
public class SummaryRanges_228 {
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
