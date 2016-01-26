package town;

import java.util.ArrayList;
import java.util.Random;

/* This class generates the Houses that Santa has to visit.
 * It spawns kids and sweets
 */

public class House {

	private static ArrayList<Kid> kidsInHouse; // Used to keep track of the kids
												// in the house.
	
	private static int numberOfKids = 0; // This is used as the next ID of the kids we add.

	private static int sweets; // Used to keep track of the number of sweets in
								// the house.

	private static Random rand = new Random(); // We will use this to get the
												// number of kids&sweets.

	// Generates a house, assigning it, kids and sweets.
	public static void generateHouse() {
		kidsInHouse = new ArrayList<Kid>(); // We initialize the ArrayList each time we
											// generate a house to keep
											// the kids from flooding the ArrayList
		
		setSweets(rand.nextInt(6)); // Our sweets to a random number from 0 to 5.

		// We add a random amount of kids from 1 to 4 in our ArrayList.
		for (int i = 0; i < rand.nextInt(4) + 1; i++) {
			kidsInHouse.add(new Kid(numberOfKids)); // Add the kid. The ArrayList
													// contains each time a random
													// amount of kids from 1-4
													// but the IDs keep rising.
			
			setNumberOfKids(getNumberOfKids() + 1); // Increase the number of kids.
		}

	}

	// Getters & Setters
	public static ArrayList<Kid> getKidsInHouse() {
		return kidsInHouse;
	}

	public static int getSweets() {
		return sweets;
	}

	public static void setSweets(int sweets) {
		House.sweets = sweets;
	}

	public static int getNumberOfKids() {
		return numberOfKids;
	}

	public static void setNumberOfKids(int numberOfKids) {
		House.numberOfKids = numberOfKids;
	}

}
