// Here we create a Stack object and test the methods
public class StackDriver {

	public static void main(String[] args) {
		// Let's create a Stack of Integers
		ArrayStack<Integer> myStack = new ArrayStack<>(7);
		myStack.push(10); System.out.println(myStack);
		myStack.pop(); System.out.println(myStack);
		myStack.pop(); System.out.println(myStack);
		myStack.push(20); System.out.println(myStack);
		myStack.push(30); System.out.println(myStack);
		myStack.push(40); System.out.println(myStack);
		myStack.push(50); System.out.println(myStack);
		System.out.println("The top of the stack is : " + myStack.peek());
		myStack.push(60); System.out.println(myStack);
		myStack.push(70); System.out.println(myStack);
		System.out.println("The top of the stack is : " + myStack.peek());
		myStack.pop(); System.out.println(myStack);
		myStack.pop(); System.out.println(myStack);
		myStack.pop(); System.out.println(myStack);
		myStack.pop(); System.out.println(myStack);
		myStack.pop(); System.out.println(myStack);
		myStack.pop(); System.out.println(myStack);
		myStack.pop(); System.out.println(myStack);
		myStack.pop(); System.out.println(myStack);
		myStack.pop(); System.out.println(myStack);
		

	}

}
