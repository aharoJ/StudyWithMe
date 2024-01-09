package LinkedList.SingleLinkedList;

import java.util.List;

public class LinkedList
{
    ListNode head;

    public int length()
    {
        ListNode current = head;
        int counter=0;
        while (current !=null) 
        {
            counter++;
            current= current.next;
        }
        return counter;
    }
    
    public void display(){
        ListNode current= head;
        while (current !=null)
        {
            System.out.print(current.data + "-->");
            current= current.next;
        }
        System.out.print("NULL \n");
    }
    
    public void insertAtStart(int data)
    {
        ListNode start_node= new ListNode(data);
        start_node.next= head;
        head= start_node;
    }

    public void insertAtEnd(int data)
    {
        ListNode end_node= new ListNode(data);
        if (head==null) {
            head= end_node; 
            return;
        }

        ListNode current= head;
        while (current.next !=null) 
        {
            current= current.next;
        }
        current.next= end_node;
    }
    
    public void insertAt(int position, int data)
    {
        ListNode node= new ListNode(data);
        if (position== 1){
            node.next = head;
            head= node;
            return;
        }
        ListNode current = head;
        int counter= 1;
        while(counter< position-1)
        {
            counter++;
            current=current.next;
        }
        node.next= current.next;
        current.next= node;
    }

    public ListNode deleteFirstNode()
    {
        if (head==null){
            return null;
        }
        ListNode current=head;
        head= head.next;
        current.next= null;
        return current;
    }

    public ListNode deleteLastNode()
    {
        if (head== null || head.next== null){
            return null;
        }
        ListNode current=head;
        while (current.next.next!=null)
        {
            current= current.next;
        }
        current.next= null;
        return current;
    }

    public void deleteAt(int position)
    {
        if (position==0 ){
            System.out.println("Invalid position || null");
        }
        if (position==1){
            head= head.next;
            return;
        }
        ListNode current=head;
        int counter=1;
        while(counter < position-1)
        {
            counter++;
            current=current.next;
        }
        current.next=current.next.next;
    }

    public boolean valueExist(int target){
        if (head==null){
            return false;
        }
        ListNode current = head;
        while (current!=null)
        {
            if (current.data== target){
                return true;
            }
            current=current.next;
        }
        return false;
    }

    public ListNode reverseLinkedList(){
        if (head==null){
            return head;
        }
        ListNode prev=null;
        ListNode current=head;
        ListNode next=null;
        while(current!=null)
        {
            next= current.next;
            current.next= prev;
            prev=current;
            current=next;
        }
        head=prev;
        return head;
    }

    public ListNode findMiddleNode()
    {
        if (head==null){
            return null;
        }

        ListNode step= head;
        ListNode two_step= head;
        while(two_step.next!= null && two_step.next.next!=null)
        {
            step= step.next;
            two_step= two_step.next.next;
        }
        //System.out.println("Middle Node: " + step.data);
        return step;
    }


    public ListNode findLastNthNode(int nth_node) {
        if (head == null || nth_node <= 0) {
            return null; // Return null for an empty list or invalid nth_node
        }
    
        ListNode hold = head; // This will eventually point to the nth node from the end
        ListNode current = head; // This will be used to find the end of the list
        int count = 1;
    
        // Advance current nth_node-1 steps ahead
        while (count <= nth_node - 1) {
            if (current == null) {
                return null; // nth_node is larger than the size of the list
            }
            current = current.next;
            count++;
        }
    
        // Move hold and current together until current is at the last node
        while (current.next != null) {
            hold = hold.next;
            current = current.next;
        }
    
        return hold; // hold is now the nth node from the end
    }
    

    public ListNode removeDuplicates()
    {
        if (head==null){
            return null;
        }
        
        ListNode current=head;
        while(current.next!=null)
        {
            if (current.data == current.next.data){
                current.next=current.next.next;
            }else{
                current=current.next;
            }
        }
        return current;
    }

    public void insertInSortedList(int value) {
        ListNode inser_node = new ListNode(value);
        if (head == null ) {
            head= inser_node;
            return;
        }
        ListNode current = head;
        // Traverse the list to find the insert location
        while (current.next != null && current.next.data < inser_node.data) {
            current = current.next; // move to the next node
        } 
        // Insert the new node after the current node
        inser_node.next = current.next;
        current.next = inser_node;
    }

    // has an issue if removing only one last node
    // public void removeKey(int target)
    // {
    //     ListNode remove_node= new ListNode(target);
    //     if (head==null){
    //         return;
    //     }
    //     ListNode current=head;
    //     while(current.next!=null && current.next.data != remove_node.data)
    //     {
    //         current= current.next;
    //     }
    //     current.next= current.next.next;
    // }


    public boolean checkIfLoops()
    {
        if (head==null){
            return false;
        }
        ListNode step=head;
        ListNode two_steps=head;
        while(two_steps!=null && two_steps.next!=null)
        {
            step=step.next;
            two_steps= two_steps.next.next;

            if (step==two_steps){
                return true;
            }
        }
        return false;
    }

    public void createManualLoop()
    {
        ListNode first= new ListNode(1);
        ListNode second= new ListNode(2);
        ListNode third= new ListNode(3);
        ListNode fourth= new ListNode(4);
        ListNode fifth= new ListNode(5);
        ListNode sixth= new ListNode(6);
        head=first;
        first.next= second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=sixth;
        sixth.next=third;
    }


    public void removeValue(int target)
    {

        if (head != null && head.data == target) {
            head = head.next;
        }

        ListNode current=head;
        while (current.next!=null)
        {

            if (current.next.data==target){
                current.next=current.next.next;
                break;
            }
            current= current.next;
        }
    }

    // // Floyd's Tortoise and Hare algorithm
    // public ListNode detectStartingLoop()
    // {
    //     ListNode step=head;
    //     ListNode two_steps=head;
    //     boolean hasLoop=false;
    //     while (two_steps!=null && two_steps.next!=null)
    //     {
    //         step=step.next;
    //         two_steps=two_steps.next.next;

    //         if (step==two_steps){
    //             return detectStartingLoopHelper(step);
    //         }
    //     }
    //     return null;
    // }
    
    // // Floyd's Tortoise and Hare algorithm
    // public ListNode detectStartingLoopHelper(ListNode meetingStep)
    // {
    //     ListNode current=head;
    //     while (current !=meetingStep) 
    //     {
    //         current=current.next;
    //         meetingStep=meetingStep.next;
    //     }
    //     return current;

    // }

    public ListNode detectCycle()
    {
        if (head==null){ return null;}
        ListNode slow=head;
        ListNode fast=head;

        while (fast !=null && fast.next !=null)
        {
            slow=slow.next;
            fast=fast.next.next;

            // if (slow==fast)
            // {
            //     return helper(slow);
            // }
            if (slow==fast)
            {
                remove(slow);
            }
        }
        return null;
    }

    private ListNode helper(ListNode intersection)
    {
        ListNode current= head;
        while(current != intersection)
        {
            current= current.next;
            intersection= intersection.next;
        }
        return intersection;
    }



    private void remove(ListNode intersection)
    {
        ListNode current=head;
        while (current.next!=intersection.next)
        {
            current=current.next;
            intersection=intersection.next;
        }
        intersection.next=null;
    }



    
    public static ListNode mergeSortedList(ListNode list_A, ListNode list_B)
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
    
        // Print the merged list
        System.out.println("Merged List:");
        while (mergeNodes != null) {
            System.out.print(mergeNodes.data + " --> ");
            mergeNodes = mergeNodes.next; // Advance to the next node
        }
        System.out.println("null"); // Print null to signify the end of the list
    }    
}

