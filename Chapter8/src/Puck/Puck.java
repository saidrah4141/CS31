/*

Program: Puck.java          Last Date of this Revision: Mar 15, 2022

Purpose: Identifies if a puck is used in the youth or standard division and compares two pucks to see if they are equal

Author: Said Rahmani, 
School: CHHS
Course: Computer Programming 30
 

*/


package Puck;

public class Puck {

	private double weight;
	boolean standard = false;
	boolean youth = false;
	
	
	public void puck (double w) {
		weight = w;
		
		if ( 5<= w && w<=5.5) {
			standard=true;
			youth=false;
		} else if (4<= w && w<=4.5) {
			
			standard=false;
			youth=true;
	}
	}
	
	public double getWeight() {
		
		return(weight);
	}
	
	public String getDivision() {
		
		String division="";
	
		if (standard == true) 
		{
			 division="Standard Division";
		}
		else if(youth==true)
		{
			division="Youth Division";
		}
		
		return(division);
		
	}
		
	
	public boolean equal(Object ob) {
		Puck puck1 = (Puck)ob;
		Puck puck2 = (Puck)ob;
		
	 	if (puck1.getWeight() == puck2.getWeight()) {
			return(true);
		} else {
			return(false);
		}
	
	 	
	 	
}
	public String toString() {
		String puckString;
		puckString = "The puck has a weight of " + weight +
					 " and is used in the  " + getDivision()  +  " division";
	 	return(puckString);
	}
	
}
