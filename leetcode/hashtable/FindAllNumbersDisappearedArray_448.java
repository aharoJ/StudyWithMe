package hashtable;

/**
 * FindAllNumbersDisappearedArray_448
 */
public class FindAllNumbersDisappearedArray_448 {
  public List<Integer> findDisappearedNumbers(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int num : nums) {
      if (!set.contains(num)) {
        set.add(num);
      }
    }
    List<Integer> result = new ArrayList<>();
    for (int i = 1; i <= nums.length; ++i) {
      if (!set.contains(i)) {
        result.add(i);
      }
    }
    return result;
  }
}
