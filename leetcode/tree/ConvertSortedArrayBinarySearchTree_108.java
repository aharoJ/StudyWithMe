package tree;

/**
 * ConvertSortedArrayBinarySearchTree_108
 */
public class ConvertSortedArrayBinarySearchTree_108 {
  public TreeNode sortedArrayToBST(int[] nums) {
    return populateSorted(nums, 0, nums.length - 1);
  }

  private TreeNode populateSorted(int[] nums, int left, int right) {
    if (left > right) {
      return null;
    }
    int mid = left + (right - left) / 2;
    TreeNode node = new TreeNode(nums[mid]); // Create the TreeNode with the mid element
    node.left = populateSorted(nums, left, mid - 1); // Recursively build the left subtree
    node.right = populateSorted(nums, mid + 1, right); // Recursively build the right subtree

    return node;
  }
}
