/*

Program: Truck.java          Last Date of this Revision: Apr 4, 2022

Purpose: An application that creates a blueprint for a truck

Author: Said Rahmani, 
School: CHHS
Course: Computer Programming 30
 

*/

package Vehicle;

public class Truck extends Vehicle {

	 	int seats;
	
		// constructor that builds a truck
		public Truck(int r, double ws, String e, int ns) {
			super(r, ws, e, ns);
			
		}

		// returns the number of seats
		public int numSeats() {
			seats= 2;
			return(seats);
		}
		
		// returns the description of the truck
		public String description() {
			
			return( "Make: "+ getMake() + ", Comes with " + numSeats() + " Seats, " + " Has a range of, " + getRange() + " km/gal "  + " Weight of, " + 
					getWeight() + "lbs, " + " and a " + getEngine() + " engine");
		
		}

		
	
	
	}
