/*

Program: ????.java          Last Date of this Revision: September 30, 2019

Purpose: An application that uses nested for loops to output a table that diplays number in 
 multiples of ten.

Author: Your Name, 
School: CHHS
Course: Computer Programming ??
 

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