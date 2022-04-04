/*

Program: Vehicle.java          Last Date of this Revision: September Apr 4, 2022

Purpose: An application that creates a general blue print for vehicles

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
	


 public Vehicle (int r, double ws, String e, int ns) {
	 range= r;
	 weight= ws;
	 make= ns;
	 engine= e;
	 
 }
 
 public int getRange() {
	 return(range);
 }
 
 
 public int getMake() {
	 return(make);
 }
 
 
 public String getEngine() {
	 return(engine);
 }

 public double getWeight() {
	 return(weight);
 }
 
 
 
 abstract int numSeats();

 
 
 abstract String description();
 
 
 }