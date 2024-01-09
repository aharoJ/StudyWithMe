package LinkedList.SingleLinkedList;

public class MergeTwoSortedList
{
    public static ListNode merge(ListNode list_A, ListNode list_B)
    {
        ListNode dummy= new ListNode(0);
        ListNode current= dummy;
        
        while (list_A!=null && list_B!=null)
        {
            if (list_A.data <= list_B.data){
                current.next= list_A;
                list_A=list_A.next;
            }else{
                current.next=list_B;
                list_B= list_B.next;
            }
            current=current.next;
        }
        if (list_A != null){
            current.next=list_A;
        } else if (list_B != null) {
            current.next=list_B;
        }
        return dummy.next;
    }



    public static void main(String[] args) {
        LinkedList list_A = new LinkedList();
        list_A.insertAtStart(1);
        list_A.insertAtEnd(3);
        list_A.insertAtEnd(5);
        
        LinkedList list_B = new LinkedList();
        list_B.insertAtEnd(2);
        list_B.insertAtEnd(6);
    
        list_A.display(); // Display list A
        list_B.display(); // Display list B
    
        // Call the merge method from the MergeSortedList class
        ListNode mergeNodes = MergeTwoSortedList.merge(list_A.head, list_B.head);
    
        while (mergeNodes != null) {
            System.out.print(mergeNodes.data + " --> ");
            mergeNodes = mergeNodes.next; // Advance to the next node
        }
        System.out.println("NULL"); // Print null to signify the end of the list
    }     
}