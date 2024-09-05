import java.util.Arrays;

/**
 * MergeSort
 */
public class MergeSort {
  public static void main(String[] args) {
    System.out.println("--------- merge sort -------------");
    int[] nums = { 38, 27, 43, 3, 9, 82, 10 };
    int[] sorted = MergeSort.mergeSort(nums);
    System.out.println(Arrays.toString(sorted));

    System.out.println("\n\n--------- in-place merge sort -------------");
    int[] nums2 = { 38, 27, 43, 3, 9, 82, 10 };
    mergeSortInPlace(nums2, 0, nums2.length);
    System.out.println(Arrays.toString(nums2));
  }

  static int[] mergeSort(int[] nums) {
    if (nums.length == 1) {
      return nums;
    }
    int mid = nums.length / 2;
    int[] left = mergeSort(Arrays.copyOfRange(nums, 0, mid));
    int[] right = mergeSort(Arrays.copyOfRange(nums, mid, nums.length));
    return merge(left, right);
  }

  static int[] merge(int[] first, int[] second) {
    int[] mix = new int[first.length + second.length];
    int i = 0;
    int j = 0;
    int k = 0;

    while (i < first.length && j < second.length) {
      if (first[i] < second[j]) {
        mix[k] = first[i];
        i++;
      } else {
        mix[k] = second[j];
        j++;
      }
      k++;
    }

    // if one of the arrys !=empty
    while (i < first.length) {
      mix[k] = first[i];
      i++;
      k++;
    }

    while (j < second.length) {
      mix[k] = second[j];
      j++;
      k++;
    }
    return mix;
  }

  static void mergeSortInPlace(int[] nums, int left, int right) {
    if (right - left <= 1) {
      return; // Base case: single element is already sorted
    }
    int mid = left + (right - left) / 2;

    // Recursively sort both halves
    mergeSortInPlace(nums, left, mid);
    mergeSortInPlace(nums, mid, right);

    // Merge the two sorted halves in place
    mergeInPlace(nums, left, mid, right);
  }

  static void mergeInPlace(int[] nums, int left, int mid, int right) {
    int i = left;
    int j = mid;

    // Merging in-place
    while (i < mid && j < right) {
      if (nums[i] <= nums[j]) {
        i++; // Left element is in the right place
      } else {
        // nums[j] is smaller, so we need to shift elements and insert nums[j] before
        // nums[i]
        int temp = nums[j];
        int k = j;

        // Shift all elements between i and j-1 one position to the right
        while (k > i) {
          nums[k] = nums[k - 1];
          k--;
        }

        nums[i] = temp;

        // Update indices
        i++;
        mid++;
        j++;
      }
    }
  }
}
