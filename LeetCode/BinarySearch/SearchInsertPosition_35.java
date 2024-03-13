package BinarySearch;

public class SearchInsertPosition_35 {

    public int searchInsert(int[] nums, int target) {
        int left=0; int right=nums.length-1;
        while (left<=right){
            int mid= left + (right-left) / 2;
            if (nums[mid]==target){
                return mid;
            }

            if (nums[mid] < target){
                left= mid+1;   
            } 
            if (nums[mid] > target){
                right=mid-1;
            }
        }   
        return left;
    }

    public static void main(String[] args) {
        SearchInsertPosition_35 solution = new SearchInsertPosition_35();

        // Test cases
        int[] nums1 = {1, 3, 5, 6};
        System.out.println("Insert position for 5: " + solution.searchInsert(nums1, 5)); // Output: 2

        int[] nums2 = {1, 3, 5, 6};
        System.out.println("Insert position for 2: " + solution.searchInsert(nums2, 2)); // Output: 1

        int[] nums3 = {1, 3, 5, 6};
        System.out.println("Insert position for 7: " + solution.searchInsert(nums3, 7)); // Output: 4

        int[] nums4 = {1, 3, 5, 6};
        System.out.println("Insert position for 0: " + solution.searchInsert(nums4, 0)); // Output: 0

        int[] nums5 = {1};
        System.out.println("Insert position for 1: " + solution.searchInsert(nums5, 1)); // Output: 0

    }
}
