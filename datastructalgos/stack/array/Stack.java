package Stack.StackArray;

import java.util.EmptyStackException;

public class Stack {
    private int[] stack;
    private int top;
    private int capacity;

    public Stack(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1; // Stack is initially empty
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public int size() {
        return top + 1;
    }

    public void push(int data) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        stack[++top] = data; // Increments top and then assigns the data
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack[top--]; // Returns the data and then decrements the top
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack[top];
    }

    public static void main(String[] args) {
        Stack stack = new Stack(3); // Create a stack with capacity 3
        stack.push(10);
        stack.push(15);
        stack.push(33);
        // stack.push(42); // Uncomment this line to see the stack overflow error
        System.out.println("The top element is: " + stack.peek()); // Should print 33
        System.out.println("The stack size is: " + stack.size()); // Should print 3
    }
}
