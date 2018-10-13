import java.util.*;

/**
 * This class implements the BagInterface using a resizable array.
 * @author tesver
 * @param <T>
 */
public class PileOfBooks<T> implements BagInterface<T> {
	int top=-1; //top of pile 
	int capacity; //array index
	private T[] bag; //stack of strings 
	private boolean integrityOK=false;
	private static final int MAX_CAPACITY = 10000;
	
	/**
	 * Constructor to create a new pile of books.
	 * @param desiredCapacity
	 */
	public PileOfBooks(int desiredCapacity)
	{
		if(desiredCapacity<=MAX_CAPACITY) {
		@SuppressWarnings("unchecked")
		T[] tempBag = (T[])new Object[desiredCapacity];
		bag=tempBag;
		capacity=desiredCapacity;
		integrityOK=true;
		}
		else 
		{
			throw new IllegalStateException("Attempt to create "
					+ "a bag whose capacity exceeds allowed "
					+ "maximum.");
		}
	}
		
	/**
	 * This method checks the integrity of the bag. 
	 */
	public void checkIntegrity()
	{
		if(!integrityOK)
			throw new SecurityException("ArrayBag object is corrupt.");
	}
	
	/**
	 * This method returns the number of books in the pile. 
	 */
	public int getCurrentSize()
	{
		return bag.length;
	}
	
	/**
	 * This methods returns true if there are not books in the pile. 
	 */
	public boolean isEmpty()
	{
		//return true if top is -1, means null
		return this.top==-1;
	}

	/**
	 * This method adds a new book to the pile and 
	 * doubles the capacity if array is full. 
	 * Returns true if the addition was successful. 
	 */
	public boolean add (T newEntry)
	{
		checkIntegrity();
		boolean result = true;
		if(this.top+1==this.capacity)
		{
			doubleCapacity();
		}
		++this.top;
		this.bag[this.top]=newEntry;
		return result;
	}
	
	/**
	 * This method removes the book at the top of the pile.
	 */
	public T remove()
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty!");
		}
		int index = this.top;
		//string looking at is string on top of stack
		T string = bag[index];
		//clear the stack @ that index
		bag[index]=null;
		//top is now below the removed item
		this.top--;
		//return string we originally looked at 
		return string;
	}
	
	/**
	 * This method returns the book title at the top of the pile. 
	 */
	public T peek()
	{
		if (isEmpty())
		{
			System.out.println("No books to see here!");
			throw new EmptyStackException();
		}
		return this.bag[this.top];
	}

	/**
	 * This method checks the capacity of the pile.
	 * If the client requests a capacity that is too large,
	 * then it throws an exception. 
	 * @param capacity
	 */
	private void checkCapacity(int capacity)
	{
		if(capacity>MAX_CAPACITY)
			throw new IllegalStateException("Attempt to create a bag"
					+ " whose capacity exceeds allowed maximum "
					+ "of " + MAX_CAPACITY);
	}
	
	/**
	 * This method doubles the capacity of the pile.
	 */
	private void doubleCapacity()
	{
		int newLength = 2*bag.length;
		checkCapacity(newLength);
		bag=Arrays.copyOf(bag, newLength);
	}

	/**
	 * This method clears all books in the pile. 
	 */
	public void clear()
	{
		while(!isEmpty())
		{
			remove();
		}
	}
}
