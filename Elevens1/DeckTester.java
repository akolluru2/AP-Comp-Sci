/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks = {"Jack", "Queen", "King"};
		String[] suits = {"Blue", "Red"};
		int[] pointsValues = {11,12,13};
		Deck d = new Deck(ranks,suits,pointsValues);
		String[] ranks1 = {"7", "8", "9"};
		String[] suits1 = {"Blue", "Red"};
		int[] pointsValues1 = {7,8,9};
		Deck d1 = new Deck(ranks1,suits1,pointsValues1);
		String[] ranks2 = {"Jack", "Queen", "King"};
		String[] suits2 = {"Green", "Yellow"};
		int[] pointsValues2 = {11,12,13};
		Deck d2 = new Deck(ranks2,suits2,pointsValues2);
	}
}
