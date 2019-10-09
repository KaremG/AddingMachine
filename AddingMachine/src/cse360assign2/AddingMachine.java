package cse360assign2;

/**
 * Assignment 2
 * Class ID: 70641
 * @author	Karem Gonzalez
 * @version	October 9, 2019
*/

 /**
  * The class AddingMachine will add, subtract, and keep track of the total.
 */

public class AddingMachine {

	private static int total;
	private static String history;
	
	/**
	 * Constructor	
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * @return total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Add method will add value to total.
	 * @param value
	 */
	public static void add (int value) {
		total += value;
		
		if ( history == "" ) {
			history += "0";
		}
		
		history = history + " + " + value;
	}
	
	/**
	 * Subtract method will subtract value from total.
	 * @param value
	 */
	public static void subtract (int value) {
		total -= value;
		
		if (history == "") {
			history += "0";
		}
		
		history = history + " - " + value;
	}
	
	/**
	 * toString method keeps history of the transactions
	 * @return history
	 */
	public String toString () {
		return history;
	}
	
	/**
	 * Clear will erase the history and clear total.
	 */
	public static void clear() {
		history = "";
		total = 0;
	}
}