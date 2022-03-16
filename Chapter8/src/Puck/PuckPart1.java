
/*

Program: ????.java          Last Date of this Revision: September 30, 2019

Purpose: An application that uses nested for loops to output a table that diplays number in 
 multiples of ten.

Author: Your Name, 
School: CHHS
Course: Computer Programming ??
 

*/




package Puck;

public class PuckPart1 {

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
		PuckPart1 puck1 = (PuckPart1)ob;
		PuckPart1 puck2 = (PuckPart1)ob;
		
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
