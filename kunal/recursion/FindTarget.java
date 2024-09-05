import java.util.ArrayList;
import java.util.List;

/**
 * FindTarget
 */
public class FindTarget {
  public static void main(String[] args) {
    int nums[] = { 3, 2, 1, 7, 7, 9, 18 };
    int target = 7;
    System.out.println(findTargetFromStart(nums, target));
    System.out.println("-----------");
    System.out.println(findTargetFromEnd(nums, target));
    System.out.println("-----------");
    findAllIndex(nums, target, 0);
    System.out.println(result);
    System.out.println("------List Param-----");
    findAllIndexWithListParam(nums, target, 0, new ArrayList<>());
    System.out.println(result);
    System.out.println("------List Inside-----");
    findAllIndexWithListInside(nums, target, 0);
    System.out.println(result);

  }

  static int findTargetFromStart(int[] nums, int target) {
    return helperStart(nums, target, 0);
  }

  static int helperStart(int[] nums, int target, int i) {
    if (i == nums.length) {
      return -1;
    }

    if (nums[i] == target) {
      return i;
    }

    return helperStart(nums, target, i + 1);
  }

  static int findTargetFromEnd(int[] nums, int target) {
    return helperEnd(nums, target, nums.length - 1);
  }

  static int helperEnd(int[] nums, int target, int i) {
    if (i == -1) {
      return -1;
    }

    if (nums[i] == target) {
      return i;
    }

    return helperEnd(nums, target, i - 1);
  }

  static List<Integer> result = new ArrayList<>();

  static void findAllIndex(int[] nums, int target, int i) {
    if (i == nums.length) {
      return;
    }

    if (nums[i] == target) {
      result.add(i);
    }
    findAllIndex(nums, target, i + 1);
  }

  static ArrayList findAllIndexWithListParam(int[] nums, int target, int i, ArrayList<Integer> list) {
    if (i == nums.length) {
      return list;
    }

    if (nums[i] == target) {
      list.add(i);
    }

    return findAllIndexWithListParam(nums, target, i + 1, list);
  }

  static ArrayList<Integer> findAllIndexWithListInside(int[] nums, int target, int i) {
    ArrayList<Integer> list = new ArrayList<>();
    if (i == nums.length) {
      return list;
    }

    if (nums[i] == target) {
      list.add(i);
    }

    ArrayList<Integer> callsFromBelow = findAllIndexWithListInside(nums, target, i + 1);
    list.addAll(callsFromBelow);
    return list;
  }
}
