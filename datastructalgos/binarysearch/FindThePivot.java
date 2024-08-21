package datastructalgos.binarysearch;


public class FindThePivot {
  public int findPivot(int[] array) {
    int left = 0;
    int right = array.length - 1;
    while (left < right) {
      int mid = left + (right - left) / 2;
      if (array[mid] > array[right]){
        left= mid+1;
      } else {
        right=mid;
      }
    }
    return left;
  }

  public static void main(String[] args) {
    FindThePivot solution = new FindThePivot();
    // ----------index = [ 00| 01| 02| 3| 4| 5| 6| 7| 08| 09| 10| ];
    int[] rotatedArray = { 42, 49, 50, 1, 3, 4, 8, 9, 11, 13, 20 };
    int index = solution.findPivot(rotatedArray);
    System.out.println("Pivot found at index: " + index);
  }
}
