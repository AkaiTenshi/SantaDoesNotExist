package santa;

import java.util.ArrayList;

import town.House;

/* 
 * This class holds the Santa's attributes like energy
 * and current position.
 */

public class Santa {
	
	// Variable (Santa's Attributes) declaration
	private static int energy;
	private static int housesVisited;
	private static int giftsDelivered; // This acts like our current kid ID to get the gifts from the bag.
	private static boolean lost;

	// Santa's Magical Bag Of DOOM AND DESTRUCTION (KAPPA).
	private static ArrayList<Gift> santaBag;

	// This function acts like a Constructor. It initializes our variables,
	// but we don't need a Santa Object so we don't have a constructor (Less
	// memory).
	public static void spawnSanta() {
		setLost(false);
		setHousesVisited(0);
		setGiftsDelivered(0);
		setEnergy(100);
	}

	// Santa eats a cookie, gets energy (facebook game at its finest).
	public static void eatSweet() {
		House.setSweets(House.getSweets() - 1);
		setEnergy(getEnergy() + 7);
	}

	// When this is called Santa starts delivering gifts and eating sweets
	// in the current house.
	public static void deliverGifts() {
		for (int i = 0; i < House.getKidsInHouse().size(); i++) {
			
			if (getEnergy() < 11) {
				while (House.getSweets() != 0) {
					eatSweet();
				}
			}
			
			if (getEnergy() >= 11) {
				santaBag.remove(0); // Put the gift under the
									// tree HO-HO-HO.
									// The gift we leave is always in the top of our list.
				
				setGiftsDelivered(getGiftsDelivered() + 1);
				setEnergy(getEnergy() - 11);
			} else {
				setLost(true);
				break;
			}
			
		}
		setHousesVisited(getHousesVisited() + 1);
	}

	// Getter & Setters
	public static int getEnergy() {
		return energy;
	}

	public static void setEnergy(int energy) {
		Santa.energy = energy;
	}

	public static int getHousesVisited() {
		return housesVisited;
	}

	public static void setHousesVisited(int housesVisited) {
		Santa.housesVisited = housesVisited;
	}

	public static int getGiftsDelivered() {
		return giftsDelivered;
	}

	public static void setGiftsDelivered(int giftsDelivered) {
		Santa.giftsDelivered = giftsDelivered;
	}

	public static boolean hasLost() {
		return lost;
	}

	public static void setLost(boolean lost) {
		Santa.lost = lost;
	}

	public static ArrayList<Gift> getSantaBag() {
		return santaBag;
	}

	public static void setSantaBag(ArrayList<Gift> santaBag) {
		Santa.santaBag = santaBag;
	}

}
