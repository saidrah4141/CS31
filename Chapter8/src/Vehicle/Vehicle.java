/*

Program: Vehicle.java          Last Date of this Revision: September Apr 4, 2022

Purpose: An application that is an abstract class defining the general details and actions associated with a vehicle
Author: Said Rahmani, 
School: CHHS
Course: Computer Programming 30
 

*/

package Vehicle;
abstract class Vehicle {
		
		private int range;
		
		private double weight;
		
		private String engine;
		
		private int make;
		
	
		// a constructor that creates a vehicle
	 public Vehicle (int r, double ws, String e, int ns) {
		 range= r;
		 weight= ws;
		 make= ns;
		 engine= e;
		 
	 }
 
 	//returns range
 	public int getRange() 
 	{
 		return(range);
 	}
 
 	//returns the make
 	public int getMake() 
 	{
 		return(make);
 	}
 
 	//returns the engine
 	public String getEngine() 
 	{
 		return(engine);
 	}

 	//returns the weight
 	public double getWeight() 
 	{
 		return(weight);
 	}
 
 
 	 // returns number of seats
	 abstract int numSeats();
	
	 
	 // returns the description of vehicle
	 abstract String description();
	 
	 
	 }