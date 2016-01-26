package santa;

/* 
 * The Gifts class
 * You know
 * To Create gifts objects
 * At Least this is no abusive.
 */

public class Gift {
	private int id;

	// Constructor
	public Gift(int _Id) {
		this.setId(_Id);
	}

	// Getters & Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
