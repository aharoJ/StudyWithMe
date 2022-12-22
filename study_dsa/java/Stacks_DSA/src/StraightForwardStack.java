public interface StraightForwardStack <E> 
{							// This is the interface for the stack
	void push(E obj);		//This is to add elements to the stack
	E pop();				// This is to remove elements in the stack
	E peek();				// This returns the top element without deleting it
	boolean isEmpty();		// Returns true if the stack is empty
}
