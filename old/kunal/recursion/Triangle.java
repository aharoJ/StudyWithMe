import java.util.Arrays;

/**
 * https://www.youtube.com/watch?v=ymgnIIclCF0&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=30
 */
public class Triangle {
  public static void main(String[] args) {
    System.out.println("------------------Downwards Trianlge--------------------");
    downTriangle(4, 0);
    System.out.println("-------------------Normal Triangle-------------------");
    nomralTriangle(4, 0);
    System.out.println("\n------------------bubble sort--------------------");

    int[] nums = { 4, 3, 2, 1 };
    bubbleSort(nums, nums.length - 1, 0);
    System.out.println(Arrays.toString(nums));
  }

  static void downTriangle(int row, int col) {
    if (row == 0) {
      return;
    }
    if (col < row) {
      System.out.print("* ");
      downTriangle(row, col + 1);
    } else {
      System.out.println();
      downTriangle(row - 1, 0);
    }
  }

  static void nomralTriangle(int row, int col) {
    if (row == 0) {
      return;
    }

    if (col < row) {
      nomralTriangle(row, col + 1);
      System.out.print("* ");
    } else {
      nomralTriangle(row - 1, 0);
      System.out.println();
    }
  }

  static void bubbleSort(int nums[], int row, int col) { // same concept as downTriangle()
    if (row == 0) {
      return;
    }

    if (col < row) {
      if (nums[col] > nums[col + 1]) {
        // swap
        int temp = nums[col];
        nums[col] = nums[col + 1];
        nums[col + 1] = temp;
      }
      bubbleSort(nums, row, col + 1);
    } else {
      bubbleSort(nums, row - 1, 0);
    }
  }

}

/**
 * ------------------Downwards Trianlge--------------------
 * * * *
 * * *
 * *
 * 
 * -------------------Normal Triangle-------------------
 * 
 * 
 * *
 * * *
 * * * *
 * ------------------bubble sort--------------------
 * [1, 2, 3, 4]
 */
