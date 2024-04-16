package Stack.StackLinkedList;

import java.util.EmptyStackException;

public class Stack {
    public ListNode top;
    public int length;
    
    public Stack(){
        top= null;
        length=0;
    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        if (length == 0){
            return true;
        } 
        return false;
    }
    public void push(int data) {
        ListNode temp= new ListNode(data);
        temp.next= top;
        top= temp;
        length++;
    }

    public int pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        int result= top.data;
        top= top.next;
        length--;
        return result;
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("Empty stack :(");
        }
        return top.data;
    }

    public static void main(String[] args) {
        Stack stack= new Stack();
        // stack.push(10);
        // stack.push(15);
        // stack.push(33);
        System.out.println(stack.peek());
    }
    
}
