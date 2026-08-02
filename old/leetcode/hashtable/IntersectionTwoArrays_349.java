package hashtable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Example 1:
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2]
 * 
 * Example 2:
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [9,4] || [4,9] is also accepted.
 */
public class IntersectionTwoArrays_349 {
  public int[] intersection(int[] nums1, int[] nums2) {
    List<Integer> list = new ArrayList<>();
    Set<Integer> set = new HashSet<>();
    for (int val : nums1) {
      set.add(val);
    }

    for (int val : nums2) {
      if (set.contains(val)) {
        list.add(val);
        set.remove(val);
      }
    }

    int[] array = new int[list.size()];
    for (int i = 0; i < list.size(); ++i) {
      array[i] = list.get(i);
    }
    return array;
  }

  public static void main(String[] args) {
    IntersectionTwoArrays_349 sol = new IntersectionTwoArrays_349();
    int[] nums1 = { 4, 9, 5 };
    int[] nums2 = { 9, 4, 9, 8, 4 };
    int[] result = sol.intersection(nums1, nums2);
    for (int val : result) {
      System.out.print(val + " ");
    }
    System.out.println();
  }
}
