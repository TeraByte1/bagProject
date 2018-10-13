/**
 * This class implements the BagInterface using a 
 * chain of linked nodes.
 * @author tesver
 * @param <T>
 */
import java.util.*;
public class PileOfBooksNodes<T> implements BagInterface<T> {
	private Node firstNode; 
	private int numberOfEntries; 
	
	/**
	 * Constructor to create new pile of books.
	 */
	public PileOfBooksNodes()
	{
		firstNode=null;
		numberOfEntries=0;
	}
	
	/**
	 * Inner class for Node
	 */
	private class Node
	{
		private T data;
		private Node next;
		
		private Node(T dataPortion)
		{
			this(dataPortion,null);
		}
		
		private Node(T dataPortion, Node nextNode)
		{
			data=dataPortion;
			next=nextNode;
		}
		
		private T getData()
		{
			return data;
		}
		
		private Node getNextNode()
		{
			return next;
		}
	}

	/**
	 * This method adds a new book to the pile.
	 * The next node is set as the new entry.
	 * Number of entries, increases by one. 
	 * Returns true if this addition was successful. 
	 */
	public boolean add(T newEntry)
	{
		Node newNode = new Node(newEntry);
		newNode.next=firstNode;
		firstNode=newNode;
		numberOfEntries++;
		return true;
	}
	
	/**
	 * This method removes the book at the top of 
	 * the pile and its title. 
	 */
	public T remove()
	{
		T result=null;
		if(firstNode !=null)
		{
			result=firstNode.getData();
			firstNode=firstNode.getNextNode();
			numberOfEntries--;
		}
		return result;
	}
	
	/**
	 * This method returns true if 
	 * there are no books in the pile. 
	 */
	public boolean isEmpty()
	{
		return numberOfEntries==0;
	}
	
	/**
	 * This method returns the number 
	 * of books in the pile.
	 */
	public int getCurrentSize()
	{
		return numberOfEntries;
	}
	
	/**
	 * This method removes all books from the pile.
	 */
	public void clear()
	{
		while(!isEmpty())
			remove();
	}
	
	/**
	 * This methods returns the top book. 
	 */
	public T peek()
	{
		if(isEmpty())
			throw new EmptyStackException();
		return firstNode.data;
	}

}
