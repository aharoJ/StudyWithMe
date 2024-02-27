package BinarySearch;

public class SearchRotatedSortedArray_33 {
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        
        if (pivot == 0 || target < nums[0]) {
            return binarySearch(nums, pivot, nums.length - 1, target);
        } else {
            return binarySearch(nums, 0, pivot - 1, target);
        }
    }

    private int findPivot(int[] nums) {
        int L = 0, R = nums.length - 1;
        while (L < R) {
            int M = L + (R - L) / 2;
            if (nums[M] > nums[R]) {
                L = M + 1;
            } else {
                R = M;
            }
        }
        return L;
    }

    private int binarySearch(int[] nums, int L, int R, int target) {
        while (L <= R) {
            int M = L + (R - L) / 2;
            if (nums[M] == target) {
                return M;
            } else if (nums[M] < target) {
                L = M + 1;
            } else {
                R = M - 1;
            }
        }
        return -1; // target not found
    }

    public static void main(String[] args) {
        SearchRotatedSortedArray_33 sol = new SearchRotatedSortedArray_33();
        int[] rotatedArray = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int index = sol.search(rotatedArray, target);
        System.out.println("Target found at index: " + index);

    }
}
