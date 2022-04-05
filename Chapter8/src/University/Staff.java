/*

Program: Staff.java          Last Date of this Revision: Mar 20, 2022

Purpose: An application that includes members for storing and returning and returning the job title
 multiples of ten.

Author: Said Rahmani, 
School: CHHS
Course: Computer Programming 30
 

*/

package University;
import java.text.*;

public class Staff extends UEmployee {
	
	private String jobTitle;
	
	// constructor that creates a staff member
	public Staff (String F, String L, int sal, String jT) 
	{
		
		super(F,L,sal);
		
		jobTitle= jT;
	}
	
	// returns title
	public String getTitle() {
		
		return(jobTitle);
	
	}
	
	//returns first and lastname salary and job title
	public String toString() {
		
		return(super.toString() + " " + getTitle());
	
	}
}
