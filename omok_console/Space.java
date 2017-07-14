/**
 * 
 */
package omok_console;

/**
 * @author Joseph Gutierrez
 *
 */
public class Space {
	private boolean occupied;
	private int highestInLine = 0;
	private Player occupant;

	// Constructor
	public Space() {

	}

	// Setters and Getters
	public boolean isOccupied() {
		return occupied;
	}

	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}

	public int getHighestInLine() {
		return highestInLine;
	}

	public void setHighestInLine(int highestInLine) {
		this.highestInLine = highestInLine;
	}

	public Player getOccupant() {
		return occupant;
	}

	public void setOccupant(Player occupant) {
		this.occupant = occupant;
	}

}
