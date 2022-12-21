// This is the class for Stack Implementation
public class ArrayStack <E> implements StraightForwardStack <E>
{
	// Storage for the stack
	private E[] theData;										// This is only the reference holder
	private int topOfStack = -1;								// Variable to store the TOS, -1 indicates if it is empty
	private static final int INITIAL_CAPACITY = 5; 				// This will be the default capacity of the stack
	private static final int EMPTY = -1; 


	// DVC 
	public ArrayStack() 
	{
		this.theData = (E[]) new Object [this.INITIAL_CAPACITY]; // The actual array needs to be created here, and the reference saved in theData
	}
	
	// EVC 
	public ArrayStack (int capacity) 
	{
		this.theData = (E[]) new Object [capacity];
	}
	
	@Override
	public void push(E obj) 									// This method adds elements to the Stack
	{
		if(this.topOfStack == this.theData.length - 1) 			// First check, if there is space to add
		{
																// Meaning, if the last element is at location capacity - 1, then it is full
			System.out.println("Stack Overflow!");			// If you want, then use reallocate similar to AL
		}
		// Otherwise, there is space to insert
		/*this.topOfStack++;
		this.theData[topOfStack] = obj;*/
		this.theData[++topOfStack] = obj;

	}

	public String toString() 
	{
		String s = "Stack: ";
		for(int i = 0; i <= this.topOfStack; i++) 
		{
			s += this.theData[i] + " | ";
			
		} return s;
	}
	
	
	@Override
	public E pop() 												// This method deletes an element from the TOS
	{
		if(isEmpty()) 											// We can call the isEmpty method if there is something to delete
		{		
			System.out.println("Stack Underflow!");
			return null;
		}
																// Otherwise, there is at least 1 element in the stack, and we can pop the TOS
		return this.theData[topOfStack--];
		//E temp = this.theData[topOfStack];
		//topOfStack--;
		//return temp;
	}

	@Override
	public E peek() 
	{
		if(isEmpty()) 											// We can call the isEmpty method if there is something to return

		{		
			System.out.println("Stack Underflow!");
			return null;
		
		} return this.theData[topOfStack]; 						// Otherwise, there is at least 1 element in the stack, and we can return the TOS
	} 

	@Override
	public boolean isEmpty() 
	{
		/*if(topOfStack == -1) 
			return true;
			else 
				return false;*/
				
			return (topOfStack == this.EMPTY);
			
	}

}
