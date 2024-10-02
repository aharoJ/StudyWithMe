package hashtable;

import java.util.HashSet;
import java.util.Set;

/**
 * Input: nums = [1,2,3,1]
 * Output: true
 * 
 * Input: nums = [1,2,3,4]
 * Output: false
 */
class ContainsDuplicate_217 {
  public boolean containsDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int vals : nums) {
      if (!set.contains(vals)) {
        set.add(vals);
      } else if (set.contains(vals)) {
        return true;
      }
    }
    return false;
  }
}
