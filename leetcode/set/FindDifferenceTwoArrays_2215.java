package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * FindDifferenceTwoArrays_2215
 */
public class FindDifferenceTwoArrays_2215 {
  public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
    List<List<Integer>> result = new ArrayList<>();

    Set<Integer> set1 = new HashSet<>();
    for (int num : nums1) {
      set1.add(num);
    }

    Set<Integer> set2 = new HashSet<>();
    for (int num : nums2) {
      set2.add(num);
    }

    // Remove common elements from set1
    for (int num : nums2) {
      set1.remove(num);
    }

    // Remove common elements from set2
    for (int num : nums1) {
      set2.remove(num);
    }

    // Add the remaining elements in set1 and set2 to the result
    result.add(new ArrayList<>(set1)); // Elements in nums1 not in nums2
    result.add(new ArrayList<>(set2)); // Elements in nums2 not in nums1

    return result;
  }
}
