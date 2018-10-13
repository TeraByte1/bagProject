/**
 * This interface defines methods for an imaginary
 * pile of books to be implemented by the PileOfBooks
 * and PileOfBooksNodes classes. which utilize a resizable
 * array and a chain of linked nodes, respectively. 
 * @author tesver
 * @param <T>
 */
public interface BagInterface<T> {
	
	/**Gets current number of entries in the bag
	 * @return The integer number of entries currently
	 * in the bag.
	 */
	public int getCurrentSize();
	
	/**
	 * Sees whether this bag is empty 
	 * @return True if the bag is empty, 
	 * or false if not 
	 */
	public boolean isEmpty();
	
	/**
	 * Adds new entry to the bag, if possible.
	 * @param newEntry The objected to be added
	 * @return True if addition is successful,
	 * or false if not
	 */
	public boolean add(T newEntry);
	
	/**
	 * Removes unspecified entry from the bag,
	 * if possible
	 * @return the Removed entry (if successful)
	 * or null
	 */
	public T remove();
	
	/**
	 * Removes all entries from this bag
	 */
	public void clear();
	
	public T peek();

}
