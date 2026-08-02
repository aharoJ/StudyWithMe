
/**
 * SB
 */
public class SB {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 4, 7, 9, 22, 37, 56, 69 };
    int target = 22;
    System.out.println(search(arr, target, 0, arr.length - 1));
  }

  static int search(int[] array, int target, int left, int right) {
    if (left > right) {
      return -1;
    }

    int mid = left + (right - left) / 2;
    if (array[mid] == target) {
      return mid;
    }
    if (array[mid] > target) {
      return search(array, target, left, mid - 1);
    } else {
      return search(array, target, mid + 1, right);
    }
  }

}
