package BinarySearch;

public class SearchRotatedSortedArray_Practice {
    public int search(int[] nums, int target) {
        
        int left = 0; int right = nums.length - 1;
        while (left < right)  // find Pivot 
        {
            int middle = left + (right - left) / 2;
            if (nums[middle] < nums[right]) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }
        
        while (left <= right) // find target index
        {
            int middle = left + (right - left) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (target < nums[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        SearchRotatedSortedArray_Practice sol = new SearchRotatedSortedArray_Practice();
        //       index     = [ 0| 1| 2| 3| 4| 5| 6|
        int[] rotatedArray = { 4, 5, 6, 7, 1, 2, 3 };
        int target = 5;
        int index = sol.search(rotatedArray, target);
        System.out.println("Target found at index: " + index);
    }
}
