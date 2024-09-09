import java.util.ArrayList;
import java.util.List;

/**
 * SubSet
 */
public class SubSet {
  public static void main(String[] args) {
    // int[] array_iterative = { 1, 2, 3 };
    // List<List<Integer>> answer = subsetIterative(array_iterative);
    // for (List<Integer> list : answer) {
    //   System.out.println(list);
    // }
    System.out.println("-------------------------");
    int[] array_recursively = { 1, 2, 3 };
    List<List<Integer>> recursive_answer = subsetRecursively(array_recursively);
    for (List<Integer> list : recursive_answer) {
      System.out.println(list);
    }
  }

  static List<List<Integer>> subsetIterative(int[] nums) {
    List<List<Integer>> outter = new ArrayList<>();
    outter.add(new ArrayList<>());
    for (int num : nums) {
      int n = outter.size();
      for (int i = 0; i < n; ++i) {
        List<Integer> internal = new ArrayList<>(outter.get(i));
        internal.add(num);
        outter.add(internal);
      }
    }
    return outter;
  }

  static List<List<Integer>> subsetRecursively(int[] nums) {
    List<List<Integer>> outter = new ArrayList<>();
    return helper(nums, 0, outter);
  }
  
  static List<List<Integer>> helper(int[] nums, int index, List<List<Integer>> outter) {
    // Base case: if index is 0, start with an empty subset
    if (index == nums.length) {
      outter.add(new ArrayList<>());
      return outter;
    }
    helper(nums, index + 1, outter);
    // Get the size before adding new subsets
    int n = outter.size();
    // Add current number to existing subsets
    for (int i = 0; i < n; ++i) {
      List<Integer> internal = new ArrayList<>(outter.get(i));
      internal.add(nums[index]);
      outter.add(internal);
    }
    return outter;
  }
}
