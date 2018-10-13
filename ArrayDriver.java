
/**
 * This class demonstrates the resizable array implementation
 * of the BagInterface
 * @author tesver
 */
public class ArrayDriver {

	public static void main(String[] args) {
	PileOfBooks<String> pile = new PileOfBooks<String>(5);
	pile.add("Pride and Prejudice");
	pile.add("Nineteen Eighty-Four");
	pile.add("The Great Gatsby");
	pile.add("Little Women");
	pile.add("Lord of the Flies");
	pile.add("Treasure Island");
	
	System.out.println("Wow, we need to move this pile of books!");
	System.out.println("At the top of the pile we have: "+ pile.peek());
	pile.remove();
	System.out.println("Next we have: " + pile.peek());
	System.out.println("Man, these are heavy! We must be done moving them"
			+ " all now, right? " +pile.isEmpty());
	System.out.println("Guess not. We still have: " + pile.peek());
	pile.remove();
	System.out.println("And then: " + pile.peek());
	pile.remove();
	System.out.println("Then: " + pile.peek());
	pile.remove();
	System.out.println("Then: " + pile.peek());
	pile.remove();
	System.out.println("And I believe the last one: " + pile.peek());
	pile.remove();
	System.out.println("This pile should be empty: " +pile.isEmpty());
	}

}
