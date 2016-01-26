package santa;

import java.util.ArrayList;

/* 
 * HO-HO-HO
 * Santa has a factory
 * Factory spits out gifts
 */

public class Factory {

	private static ArrayList<Gift> gifts; // To store our gifts.

	public static void generateGifts() {
		// Initialize the array.
		gifts = new ArrayList<Gift>();

		// Loop from 0 to my AM to create the gifts for all the kids.
		for (int i = 0; i < 21456; i++) {
			gifts.add(new Gift(i)); // Add the gift to the array
		}
	}

	// Getters & Setters
	public static ArrayList<Gift> getGifts() {
		return gifts;
	}

	public static void setGifts(ArrayList<Gift> gifts) {
		Factory.gifts = gifts;
	}
}
