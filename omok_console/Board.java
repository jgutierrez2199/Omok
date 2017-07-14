/**
 * 
 */
package omok_console;

/**
 * @author Joseph Gutierrez
 *
 */
public class Board {
	//Change board size here
	private int sideLength = 15;
	private Space [] space; 
	private Player [] player = new Player [2];
 
	
	public Board(){
		space = new Space [size*size];
		player[0] = new Player("X");
		player[1] = new Player("O");
	}
	
	public print(){
		//Top legend line
		System.out.print("y\x|");
		for(int i = 1; i <= sideLength; i ++){
			System.out.print(" " + i + " |");
		}
		//rest of 
		
	}
}
