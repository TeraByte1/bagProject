/**
 * This class demonstrates the chain of linked nodes implementation
 * of the BagInterface.
 * @author tesver
 *
 */
public class LinkedDriver {

	public static void main(String[] args) {
	PileOfBooksNodes<String> pile = new PileOfBooksNodes<String>();
	pile.add("Divergent");
	pile.add("The Giver");
	pile.add("The Outsiders");
	pile.add("The Fault in Our Stars");
	pile.add("The Book Thief");
	pile.add("The Hunger Games");
	
	System.out.println("Wow, we need to move this pile of books!");
	System.out.println("At the top of the pile we have: "+ pile.peek());
	pile.remove();
	System.out.println("Next we have: " + pile.peek());
	pile.remove();
	System.out.println("Man, these are heavy! We must be done moving them"
			+ " all now, right? " +pile.isEmpty());
	System.out.println("Guess not. We still have: " + pile.peek());
	pile.remove();
	System.out.println("And then: " + pile.peek());
	pile.remove();
	System.out.println("Then: " + pile.peek());
	pile.remove();
	System.out.println("And I believe the last one: " + pile.peek());
	pile.remove();
	System.out.println("This should be the end of the pile: " + pile.isEmpty());
	}

}
