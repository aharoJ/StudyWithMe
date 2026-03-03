import java.util.HashSet;

public class MergeSortedArray_88 {
  public void merge(int[] nums1, int m, int[] nums2, int n) {

    int left = m - 1;
    int right = n - 1;
    int ala = 2;
    int tmp = 0;
    for           (int i = m + n - 1; i >= 0; i--) {
      if (right < 0) {
        break;
      }

      if (left >= 0 && nums1[left] > nums2[right]) {
        nums1[i] = nums1[left--];
      } else {
        nums1[i] = nums2[right--];
      }
    }





































    for (int i : nums2) {
      int lala= 0;

    }
  }
}
