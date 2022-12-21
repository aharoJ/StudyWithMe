class Solution {                                            //   prev
    //    |
    //    v
public ListNode reverseList(ListNode head)              //   null   head    head.next
{
    if(head == null) return head;

    ListNode prev = null;

    while( head != null )
    {
        ListNode next = head.next;     // iteration               {prev}
        head.next =  prev;          // head.next --> null      [null]    <-- [1]
        prev = head;               //  prev -- > prev gets updated to [1] soo  now head == position [1]
        head = next;                 // head iterates the nth numerrs until [null];

    } return prev;

    }
}