package linkedlist;

/**
 * PalindromeLinkedList_234
 */
public class PalindromeLinkedList_234 {
  // Function to check if a linked list is a palindrome
  public boolean isPalindrome(ListNode head) {
    ListNode mid = middleNode(head); // Find the middle node
    ListNode headSecond = reverseList(mid); // Reverse the second half of the list
    ListNode reverseHead = headSecond; // Store the head of the reversed list for later restoration

    // Compare both halves of the list
    while (head != null && headSecond != null) {
      if (head.val != headSecond.val) {
        break; // If values are different, it's not a palindrome
      }
      head = head.next; // Move to the next node in the first half
      headSecond = headSecond.next; // Move to the next node in the second half
    }

    reverseList(reverseHead); // Restore the original list by reversing the second half back
    return head == null || headSecond == null; // Return true if it's a palindrome
  }

  // Function to reverse a linked list
  private ListNode reverseList(ListNode head) {
    ListNode prev = null;
    while (head != null) {
      ListNode next = head.next; // Store the next node
      head.next = prev; // Reverse the link
      prev = head; // Move prev to the current node
      head = next; // Move to the next node in the original list
    }
    return prev; // Return the new head of the reversed list
  }

  // Function to find the middle node of a linked list
  private ListNode middleNode(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;

    // Move slow pointer one step and fast pointer two steps at a time
    while (fast != null && fast.next != null) {
      slow = slow.next; // Move slow pointer one step
      fast = fast.next.next; // Move fast pointer two steps
    }

    return slow; // When fast reaches the end, slow is at the middle
  }
}
