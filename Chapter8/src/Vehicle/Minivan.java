/*

Program: Minivan.java          Last Date of this Revision: Apr 4, 2022

Purpose: An application that creates a blueprint for a minivan

Author: Said Rahmani, 
School: CHHS
Course: Computer Programming 30
 

*/

package Vehicle;

	// constructor that builds a minivan
	public class Minivan extends Vehicle {
		int seats;
		public Minivan(int r, double ws, String e, int ns) {
			super(r, ws, e, ns);
			
		}

	//returns the number of seats
	public int numSeats() {
		seats= 7;
		return(seats);
	}
	
	// returns the description of the minivan
	public String description() {
		return("Make: "+ getMake() + ", Comes with " + numSeats() + " Seats, " + " Has a range of, " + getRange() + " km/gal "  + " Weight of, " + 
				getWeight() + "lbs, " + " and a " + getEngine() + " engine");
		
	}

	
}
