package main;

import java.util.logging.Level;
import java.util.logging.Logger;

import santa.Factory;
import santa.Santa;
import santa.Takis;
import town.House;
import util.MessageLogger;

public class Main {

	public static void main(String[] args) {
		// First we setup our Logger
		MessageLogger.setup();
		
		// Get the global Logger
		Logger LOGGER = Logger.getGlobal();
		
		Santa.spawnSanta(); // Santa spawns.
		LOGGER.log(Level.INFO, "SANTA SPAWNED");
		
		Factory.generateGifts(); // Gifts are spawned.
		LOGGER.log(Level.INFO, "GIFTS SPAWNED");
		
		Takis.loadBag(); // Santa's bag is loaded.
		LOGGER.log(Level.INFO, "TAKIS LOADED THE BAG");
		
		LOGGER.log(Level.INFO, "DELIVERY IS STARTING...");
		// Now the fun starts.
		while(House.getNumberOfKids() != 21456 && Santa.hasLost() != true){
			House.generateHouse();
			Santa.deliverGifts();
		}
		
		// If you see this then I don't know what to say.
		if(Santa.hasLost() == false){
			LOGGER.log(Level.INFO, "SANTA HAS DELIVER ALL THE GIFTS!"
					+ " HOUSES VISITED:" + Santa.getHousesVisited()
					+ " GIFTS DELIVERED:" + Santa.getGiftsDelivered()
					+ " ENERGY REMAINING:" + Santa.getEnergy());
		// You will see this though.
		} else {
			LOGGER.log(Level.INFO, "SANTA HAS FAILED!"
					+ " HOUSES VISITED:" + Santa.getHousesVisited()
					+ " GIFTS DELIVERED:" + Santa.getGiftsDelivered()
					+ " ENERGY REMAINING:" + Santa.getEnergy());
		}
		
		
		


	}

}
