package linkedlist;

/**
 * This is the ListNode class used across multiple LeetCode problems.
 * It is included here to avoid errors in the local environment when
 * working on the StudyGuide for FAANG interview prep.
 * 
 * NOTE: For LeetCode submissions, this class is already provided.
 */
public class ListNode {
  public int val;
  public ListNode next;

  // Default constructor
  public ListNode() {
  }

  // Constructor with value
  public ListNode(int val) {
    this.val = val;
  }

  // Constructor with value and next node
  public ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }
}
