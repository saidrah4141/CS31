/*

Program: Faculty.java          Last Date of this Revision: Mar 24, 2022

Purpose: An application that includes members for and returning the department name

Author: Said Rahmani, 
School: CHHS
Course: Computer Programming 30
 

*/

package University;

public class Faculty extends UEmployee {
	
	private String depName;
	
	// constructor that initializes the first name, last name, salary, and department
	public Faculty (String F, String L, int sal, String dN) 
	{
		super(F,L,sal);
		depName = dN;
	}
	
	//returns department name
	public String getDepartment() 
	{
		return(depName);
	}
	
	// returns first and last name, salary and department
	public String toString() 
	{
		return(super.toString() + " " + getDepartment());
	}
}
