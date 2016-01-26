package santa;

import java.util.ArrayList;

/*
 * Takis is an elf
 * Takis loads Santa's bag
 * Takis hates his job
 * Don't be like Takis
 */

public class Takis {
	
	public static void loadBag(){
		
		Santa.setSantaBag(new ArrayList<Gift>(Factory.getGifts())); // We get the gifts from the factory and dump them here.
		Factory.getGifts().clear(); // The gifts from the factory are removed.
		
	}
	
	/* Yes this is to small to get its own class but 
	 * I have plans for this assignment in the future.
	 */

}
