/*

Program: Car.java          Last Date of this Revision: Apr 4, 2022

Purpose: An application that makes a blue print for a car

Author: Said Rahmani, 
School: CHHS
Course: Computer Programming 30
 

*/

package Vehicle;

public class Car extends Vehicle {

	
	int seats;
	public Car(int r, double ws, String e, int ns) {
		super(r, ws, e, ns);
		
	}

	public int numSeats() {
		seats= 5;
		return(seats);
	}
	
	public String description() {
		String de ="Make: "+ getMake() + ", Comes with " + numSeats() + " Seats, " + " Has a range of, " + getRange() + " km/gal "  + " Weight of, " + 
	getWeight() + "lbs, " + " and a " + getEngine() + " engine";
		return(de);
	}

	
	
}
