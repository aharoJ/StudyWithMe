package practice;

/**
 * FindTarget
 */
public class FindTarget {
  // if nums[j]-nums[i]== target
  // counter++;
  public int foundK(int[] array, int target) {
    int counter = 0;
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length; j++) {
        if (array[j] - array[i] == target) {
          counter++;
        }
      }
    }
    return counter;
  }

  public static void main(String[] args) {
    int[] array = { 7, 2, 3, 8, 5, 6, 7, 8, 9 };
    int target = 5;
    FindTarget ft = new FindTarget();
    System.out.println(ft.foundK(array, target));

  }
}
